import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EX_15_Animation extends Application {
        @Override
        public void start(Stage primaryStage) {
                BorderPane pane = new BorderPane();
                //Create rectangle
                Rectangle rectangle = new Rectangle(0, 0, 90, 130);
                rectangle.setFill(Color.CORAL);

                //Polygon
                double width = 300;
                double height = 300;
                Polygon polygon = new Polygon();
                polygon.setFill(Color.BLUEVIOLET);
                ObservableList<Double> list = polygon.getPoints();
                double centerX = width / 2, centerY = height / 2;
                double radius = Math.min(width, height) * 0.4;
                int s = 6;
                // Add points to the polygon list
                for (int i = 0; i < s; i++) {
                        list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
                        list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
                }



                        //Add objects to pane
                        pane.setLayoutY(90);
                        pane.setLayoutX(90);
                        pane.getChildren().add(rectangle);
                        pane.getChildren().add(polygon);

                        //path transition
                        PathTransition pt = new PathTransition();
                        pt.setDuration(Duration.millis(4000));
                        pt.setPath(polygon);
                        pt.setNode(rectangle);

                        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
                        pt.setCycleCount(Timeline.INDEFINITE);
                        pt.setAutoReverse(false);


                        pane.setOnMousePressed(mouseEvent -> {
                                if(mouseEvent.getButton()== MouseButton.PRIMARY){
                                        pt.play();
                                }
                                else if (mouseEvent.getButton()==MouseButton.SECONDARY){
                                        pt.pause();
                                        }
                                });


                        Scene scene = new Scene(pane, 500, 500);
                        primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
                        primaryStage.setScene(scene); // Place the scene in the stage
                        primaryStage.show(); // Display the stage


                }


                public static void main (String[]args){
                        Application.launch(args);
                }

}
