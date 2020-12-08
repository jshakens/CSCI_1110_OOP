/**
 * Jordan Shakespeare Object Oriented Programing
 * Application displays a Clock pane with random hour and minute hands.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class clockPane extends Application{

    public static void main(String[] args) {
        launch(args);
    }
        @Override // Override the start method in the Application class
            public void start(Stage primaryStage) {
                  // Create a clock and a label
                  clockObject clock = new clockObject((int)(Math.random()*12),
            ((int)(Math.random() * 2) == 1 ? 30 : 0), 0);
                  String timeString = clock.getHour() + ":" + clock.getMinute()
                    + ":" + clock.getSecond();
                  clock.setSecondHandVisible(false);
                  Label lblCurrentTime = new Label(timeString);

                  // Place clock and label in border pane
                  BorderPane pane = new BorderPane();
                  pane.setCenter(clock);
                  pane.setBottom(lblCurrentTime);
                  BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

                  // Create a scene and place it in the stage
                  Scene scene = new Scene(pane, 250, 250);
                  primaryStage.setTitle("Random Clock"); // Set the stage title
                  primaryStage.setScene(scene); // Place the scene in the stage
                 primaryStage.show(); // Display the stage
            }
          }


