/** Jordan Shakespeare
 * Exercise 15 program creates a ball that can be moved with arrow keys and buttons
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class EX15 extends Application {
    public void start(Stage primaryStage) throws Exception{
    double width = 400;
    double height = 400;
    ControlCircle ballPane = new ControlCircle(width / 2,height / 2, Math.min(width,height) / 15);

    Button btUp = new Button("Up");
        btUp.setOnAction(e -> ballPane.moveUp());

    Button btDown = new Button("Down");
        btDown.setOnAction(e -> ballPane.moveDown());

    Button btLeft = new Button("Left");
        btLeft.setOnAction(e -> ballPane.moveLeft());

    Button btRight = new Button("Right");
        btRight.setOnAction(e -> ballPane.moveRight());

    HBox buttons = new HBox(btUp, btDown, btLeft, btRight);
        buttons.setAlignment(Pos.BOTTOM_CENTER);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(10, 10, 10, 10));

        ballPane.setOnKeyPressed(e -> {
                   switch (e.getCode()) {
                       case DOWN: ballPane.moveDown(); break;
                       case UP: ballPane.moveUp(); break;
                       case LEFT: ballPane.moveLeft(); break;
                       case RIGHT: ballPane.moveRight(); break;
                   }
        });

    BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(buttons);

    Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click to move ball");
        primaryStage.show();


        scene.widthProperty().addListener((observableValue, number, t1) -> ballPane.setMaxWidth(scene.getWidth()));
        scene.heightProperty().addListener((observableValue, number, t1) -> ballPane.setMaxHeight(scene.getHeight()));
        scene.heightProperty().addListener((observableValue, number, t1) -> ballPane.setMinHeight(scene.getHeight()));
        ballPane.requestFocus();
}
public static void main(String[] args){
    Application.launch(args);
    }
}
