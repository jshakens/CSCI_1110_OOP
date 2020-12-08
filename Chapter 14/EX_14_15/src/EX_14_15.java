import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Jordan Shakespeare Stop Sign
 * project displays a stop sign.
 *
 */

public class EX_14_15 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Text t = new Text("STOP");
        t.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
        t.setFill(Color.WHITE);
        Pane pane = new StackPane();
        pane.getChildren().add( new MyPolygon());
        pane.getChildren().add(t);
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("ShowPolygon"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }

}
