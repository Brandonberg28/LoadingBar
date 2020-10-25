import java.util.*;
import java.text.*;
import java.io.*;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;


public class AnimationCanvas extends Canvas
{         

   GraphicsContext gc = getGraphicsContext2D();
   private int barLength = 0;
   AnimationHandler ah = new AnimationHandler();
      
   public AnimationCanvas()
   {
      setWidth(800);      
      setHeight(200);
      ah.start();
      
      setOnKeyPressed(new KeyHandler());
      
      draw(gc);
   }
   
   public void draw(GraphicsContext gc)  //method to draw the bar
   {      
      gc.setFill(Color.WHITE);
      gc.fillRect(200,60,372,40);
      gc.setFill(Color.BLUE);
      gc.fillRect(205,65,361,30);
      gc.clearRect(208,69,354,23);
   }
   
   public class AnimationHandler extends AnimationTimer
   {
      public void handle(long currentTimeInNanoSeconds)  
      {  
         gc.setFill(Color.GREEN);
         gc.fillRect(208,69,barLength++,23); 
         if(barLength > 354)  
         {
            gc.clearRect(208,69,354,23);
            barLength = 0;           
         }        
      }
   }
   

   public class KeyHandler implements EventHandler<KeyEvent>
   {
      public void handle(KeyEvent event)
      {         
         if(event.getCode() == KeyCode.A) //press A to stop the bar from loading
         {
            ah.stop();
         }
         if(event.getCode() == KeyCode.S) //press S to resume loading bar
         {
            ah.start();
         }
      }
   }

   
}