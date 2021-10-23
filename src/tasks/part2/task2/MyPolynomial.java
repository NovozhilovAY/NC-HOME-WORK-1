package tasks.part2.task2;

import tasks.part1.task6.DoubleComparator;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        int degree = 0;
        for(int i = coeffs.length - 1; i >= 0; i--)
        {
            if(!DoubleComparator.equal(coeffs[i],0.0)){
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = getDegree(); i >= 0; i--)
        {
            result += getStrOfMonom(i);
        }
        return result;
    }

    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] result_coeffs;
        MyPolynomial biggestPolynom = this;
        MyPolynomial smallestPolynom = right;
        if(right.getDegree() > this.getDegree()) {
            biggestPolynom = right;
            smallestPolynom = this;
        }
        result_coeffs = new double[biggestPolynom.getDegree() + 1];
        int i = 0;
        for(;i < smallestPolynom.getDegree() + 1; i++)
        {
            result_coeffs[i] = smallestPolynom.coeffs[i] + biggestPolynom.coeffs[i];
        }
        for(;i<biggestPolynom.getDegree() + 1;i++){
            result_coeffs[i] = biggestPolynom.coeffs[i];
        }
        return new MyPolynomial(result_coeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newSize = this.getDegree() + right.getDegree() + 1;
        double[] resultCoeffs = new double[newSize];
        MyPolynomial result = new MyPolynomial(resultCoeffs);
        for(int i = 0; i < coeffs.length; i++)
        {
            double[] tmpCoeffs = new double[newSize];
            for(int j = 0; j < right.coeffs.length; j++) {
                tmpCoeffs[i + j] = coeffs[i] * right.coeffs[j];
            }
            MyPolynomial tmpPolynom = new MyPolynomial(tmpCoeffs);
            result = result.add(tmpPolynom);
        }
        return result;
    }
    
    private String getStrOfMonom (int position)
    {
        if(getDegree() == 0)
            return String.valueOf(coeffs[position]);
        if(position == getDegree())
            return coeffs[position] + "x^" + position;
        if(DoubleComparator.equal(coeffs[position],0.0))
            return "";
        if(position == 0)
            return getSign(coeffs[position]) + coeffs[position];
        if(position == 1)
            return getSign(coeffs[position]) + coeffs[position] + "x";

        return getSign(coeffs[position]) + coeffs[position] + "x^" + position;
    }
    
    private String getSign(double coeff) {
        if(DoubleComparator.more(coeff,0.0))
            return "+";
        else
            return "";
    }
}
