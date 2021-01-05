import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static javafx.scene.paint.Color.*;


public class EX_16_1 extends Application {
    protected Text text = new Text(400,200,"Hello There");
    private double dx = 1;
@Override
    public void start(Stage primaryStage){

        //Movement Buttons
        BorderPane BP = new BorderPane();
        HBox arrowButtons = new HBox(20);
        Button button1 = new Button("<-");
        Button button2 = new Button("->");
        arrowButtons.getChildren().addAll(button1,button2);
        arrowButtons.setSpacing(20);
        arrowButtons.setAlignment(Pos.CENTER);
        BP.setBottom(arrowButtons);


        //Radio button constructor
    HBox paneForRadioButtons = new HBox(20);
    RadioButton rbRed = new RadioButton("Red");
    RadioButton rbGreen = new RadioButton("Green");
    RadioButton rbBlue = new RadioButton("Blue");
    RadioButton rbBlack = new RadioButton("Black");
    paneForRadioButtons.setAlignment(Pos.TOP_CENTER);
    paneForRadioButtons.getChildren().addAll(rbBlue,rbGreen,rbBlack,rbRed);

    ToggleGroup group = new ToggleGroup();
          rbRed.setToggleGroup(group);
          rbGreen.setToggleGroup(group);
          rbBlue.setToggleGroup(group);
          rbBlack.setToggleGroup(group);



    Pane paneForText = new Pane();
    paneForText.setStyle("-fx-border-color: black");
    paneForText.getChildren().add(text);
    BP.setCenter(paneForText);
    BP.setTop(paneForRadioButtons);

    if(text.getX()<0){
        text.setX(text.getX()+20);}
    else{
    button1.setOnAction(e -> text.setX(text.getX() - 20));}
    if(text.getX() > 1000){
         text.setX(text.getX()-20);}
    else {
    button2.setOnAction(e -> text.setX(text.getX() + 20));}

          rbRed.setOnAction(e -> {
                if (rbRed.isSelected()) {
                      text.setFill(RED);
                    }
              });

          rbGreen.setOnAction(e -> {
                if (rbGreen.isSelected()) {
                      text.setFill(GREEN);
                    }
              });

          rbBlue.setOnAction(e -> {
                if (rbBlue.isSelected()) {
                      text.setFill(BLUE);
                    }
              });
          rbBlack.setOnAction(event -> {
              if (rbBlack.isSelected()){
                  text.setFill(BLACK);
              }
          });


          //Set Scene
    Scene scene = new Scene(BP,1000,600);
    primaryStage.setTitle("OBI WAN KENOBI");
    primaryStage.setScene(scene);
    primaryStage.show();


}
public static void main(String[] args) {
    Application.launch(args);

    }
}
