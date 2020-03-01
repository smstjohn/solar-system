import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;


public class SolarSystem extends Application {
   public static void main(String[] args) {
      launch(args);
   }
   @Override
   public void start (Stage primaryStage) {
      //constants for scene size
      final double SCENE_WIDTH = 1000.0;
      final double SCENE_HEIGHT = 700.0;
      
      //constants for the planets, orbit, and sun
      final double SUN_X = 500.0;
      final double SUN_Y = 350.0;
      final double SUN_RAD = 25.0;
      
      final double ORBIT1_RAD_X = 60.0;
      final double ORBIT1_RAD_Y = 30.0;
      
      final double ORBIT2_RAD_X = 100.0;
      final double ORBIT2_RAD_Y = 50.0;
      
      final double ORBIT3_RAD_X = 140.0;
      final double ORBIT3_RAD_Y = 70.0;
      
      final double ORBIT4_RAD_X = 180.0;
      final double ORBIT4_RAD_Y = 110.0;
      
      final double ORBIT5_RAD_X = 220.0;
      final double ORBIT5_RAD_Y = 140.0;
      
      final double ORBIT6_RAD_X = 260.0;
      final double ORBIT6_RAD_Y = 170.0;
      
      final double ORBIT7_RAD_X = 300.0;
      final double ORBIT7_RAD_Y = 200.0;
      
      final double ORBIT8_RAD_X = 340.0;
      final double ORBIT8_RAD_Y = 230.0;
      
      final double ORBIT9_RAD_X = 370.0;
      final double ORBIT9_RAD_Y = 260.0;
      
      final double MERCURY_X = 440.0;
      final double MERCURY_Y = 350.0;
      final double MERCURY_RAD = 5.0;
      
      final double VENUS_X = 600.0;
      final double VENUS_Y = 350.0;
      final double VENUS_RAD = 8.0;

      final double EARTH_X = 600.0;
      final double EARTH_Y = 300.0;
      final double EARTH_RAD = 10.0;
      
      final double MARS_X = 550.0;
      final double MARS_Y = 455.0;
      final double MARS_RAD = 8.0;
      
      final double JUPITER_X = 550.0;
      final double JUPITER_Y = 215.0;
      final double JUPITER_RAD = 16.0;

      final double SATURN_X = 275.0;
      final double SATURN_Y = 262.0;
      final double SATURN_RAD = 14.0;

      final double URANUS_X = 400.0;
      final double URANUS_Y = 568.0;
      final double URANUS_RAD = 12.0;

      final double NEPTUNE_X = 800.0;
      final double NEPTUNE_Y = 350.0;
      final double NEPTUNE_RAD = 12.0;

      final double PLUTO_X = 158.0;
      final double PLUTO_Y = 250.0;
      final double PLUTO_RAD = 6.0;
      

      //draw the planetS
      Circle mercury = new Circle(MERCURY_X, MERCURY_Y, MERCURY_RAD, Color.CRIMSON);
      Circle venus = new Circle(VENUS_X, VENUS_Y, VENUS_RAD, Color.GOLD);
      Circle earth = new Circle(EARTH_X, EARTH_Y, EARTH_RAD, Color.OLIVE);
      Circle mars = new Circle(MARS_X, MARS_Y, MARS_RAD, Color.RED);
      Circle jupiter = new Circle(JUPITER_X, JUPITER_Y, JUPITER_RAD, Color.ORANGE);
      Circle saturn = new Circle(SATURN_X, SATURN_Y, SATURN_RAD, Color.PLUM);
      Circle uranus = new Circle(URANUS_X, URANUS_Y, URANUS_RAD, Color.TEAL);
      Circle neptune = new Circle(NEPTUNE_X, NEPTUNE_Y, NEPTUNE_RAD, Color.DARKGREEN);
      Circle pluto = new Circle(PLUTO_X, PLUTO_Y, PLUTO_RAD, Color.DARKGREY);
      
      //Draw the SUN
      Circle sun = new Circle(SUN_X, SUN_Y, SUN_RAD, Color.YELLOW);

      //Draw the elliptical orbit path
      Ellipse orbitPath1 = new Ellipse(SUN_X, SUN_Y, ORBIT1_RAD_X, ORBIT1_RAD_Y);
      orbitPath1.setFill(null);
      orbitPath1.setStroke(Color.BLACK);
      
      Ellipse orbitPath2 = new Ellipse(SUN_X, SUN_Y, ORBIT2_RAD_X, ORBIT2_RAD_Y);
      orbitPath2.setFill(null);
      orbitPath2.setStroke(Color.BLACK);
      
      Ellipse orbitPath3 = new Ellipse(SUN_X, SUN_Y, ORBIT3_RAD_X, ORBIT3_RAD_Y);
      orbitPath3.setFill(null);
      orbitPath3.setStroke(Color.BLACK);

      Ellipse orbitPath4 = new Ellipse(SUN_X, SUN_Y, ORBIT4_RAD_X, ORBIT4_RAD_Y);
      orbitPath4.setFill(null);
      orbitPath4.setStroke(Color.BLACK);

      Ellipse orbitPath5 = new Ellipse(SUN_X, SUN_Y, ORBIT5_RAD_X, ORBIT5_RAD_Y);
      orbitPath5.setFill(null);
      orbitPath5.setStroke(Color.BLACK);

      Ellipse orbitPath6 = new Ellipse(SUN_X, SUN_Y, ORBIT6_RAD_X, ORBIT6_RAD_Y);
      orbitPath6.setFill(null);
      orbitPath6.setStroke(Color.BLACK);

      Ellipse orbitPath7 = new Ellipse(SUN_X, SUN_Y, ORBIT7_RAD_X, ORBIT7_RAD_Y);
      orbitPath7.setFill(null);
      orbitPath7.setStroke(Color.BLACK);

      Ellipse orbitPath8 = new Ellipse(SUN_X, SUN_Y, ORBIT8_RAD_X, ORBIT8_RAD_Y);
      orbitPath8.setFill(null);
      orbitPath8.setStroke(Color.BLACK);

      Ellipse orbitPath9 = new Ellipse(SUN_X, SUN_Y, ORBIT9_RAD_X, ORBIT9_RAD_Y);
      orbitPath9.setFill(null);
      orbitPath9.setStroke(Color.BLACK);


      //add the boxes to a pane
      Pane pane = new Pane(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, pluto, 
      orbitPath1, orbitPath2,orbitPath3, orbitPath4, orbitPath5, orbitPath6, orbitPath7, orbitPath8, orbitPath9, 
      sun);
      
      //create a scene and display it
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
