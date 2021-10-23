package tasks.part2.task1;

import com.sun.istack.internal.NotNull;
import tasks.part1.task6.DoubleComparator;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        String result = "(";
        result += real;
        if(DoubleComparator.moreOrEqual(imag, 0.0)){
            result += "+" + imag;
        }
        else {
            result += imag;
        }
        result+="i)";
        return result;
    }

    public boolean isReal()
    {
        if(DoubleComparator.equal(real, 0.0))
            return false;
        else
            return true;
    }

    public boolean isImaginary()
    {
        if(DoubleComparator.equal(imag, 0.0))
            return false;
        else
            return true;
    }

    public boolean equals(double real, double imag) {
        if(DoubleComparator.equal(this.real, real) && DoubleComparator.equal(this.imag, imag))
            return true;
        else
            return false;
    }

    public boolean equals(MyComplex another) {
        return equals(another.real,another.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag, 2));
    }

    public double argument() {
        if(DoubleComparator.more(real, 0.0))
            return Math.atan(imag / real);
        else if(DoubleComparator.less(real,0.0) && DoubleComparator.moreOrEqual(imag, 0))
            return Math.atan(imag / real) + Math.PI;
        else if(DoubleComparator.less(real, 0.0) && DoubleComparator.less(imag, 0.0))
            return Math.atan(imag / real) - Math.PI;
        else if(DoubleComparator.equal(real, 0.0) && DoubleComparator.more(imag, 0.0))
            return Math.PI / 2.0;
        else if(DoubleComparator.equal(real, 0.0) && DoubleComparator.less(imag, 0.0))
            return -Math.PI / 2.0;
        else
            return 0.0;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex(this.real, this.imag);
        return newComplex.add(right);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex(this.real, this.imag);
        return newComplex.subtract(right);
    }

    public MyComplex multiply(MyComplex right) {
        double resultReal = this.real * right.real - this.imag * right.imag;
        double resultImag = this.real * right.imag + right.real * this.imag;
        this.real = resultReal;
        this.imag = resultImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double resultReal = (this.real * right.real + this.imag * right.imag) / (Math.pow(right.real,2) + Math.pow(right.imag,2));
        double resultImag = (right.real * this.imag - this.real * right.imag) / (Math.pow(right.real,2) + Math.pow(right.imag,2));
        this.real = resultReal;
        this.imag = resultImag;
        return this;
    }

    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }
}
