import javafx.event.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.animation.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import java.util.*;

public class LoadingBar extends Application
{
       
   public void start(Stage stage)
   {
      
      FlowPane root = new FlowPane();
      root.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
      
      AnimationCanvas animationCanvas = new AnimationCanvas();
      
      root.getChildren().add(animationCanvas);
               
      Scene scene = new Scene(root, 800, 200);
      stage.setScene(scene);
      stage.setTitle("Loading Bar");
      stage.show();
      
      animationCanvas.requestFocus();  //set the focus to the canvas
   }
   
   
   public static void main(String[] args)
   {
      launch(args);
   }
   
}