package tasks.part2.task3;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UI extends Application {

    @Override
    public void start(final Stage primaryStage) {
        Group root = new Group();
        Container container = new Container(10,10,480, 420);
        Ball ball = new Ball(150,150,25,10,128);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                switch (container.getBallCondition(ball))
                {
                    case IN_CONTAINER:
                        break;
                    case TOUCHES_HORIZONTAL_LINES:
                        ball.reflectVertical();
                        break;
                    case TOUCHES_VERTICAL_LINES:
                        ball.reflectHorizontal();
                        break;
                    case TOUCHES_BOTH_LINES:
                        ball.reflectHorizontal();
                        ball.reflectVertical();
                        break;
                }
                ball.move();
            }
        };
        Button button = new Button("Start");
        button.setMinSize(100, 40);
        button.setLayoutX(200);
        button.setLayoutY(450);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timer.start();
                button.setDisable(true);
            }
        });
        root.getChildren().addAll(container, ball, button);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("BallTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
