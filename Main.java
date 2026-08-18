import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(1000,1000);
    
    Turtle turtle1 = new Turtle(200, 200, world);
    Turtle turtle2 = new Turtle(800, 200, world);
    Turtle turtle3 = new Turtle(200, 800, world);
    Turtle gerald = new Turtle(800, 800, world);

    turtle1.circle(300, turtle1);

    turtle2.setShellColor(Color.RED);
    turtle2.setBodyColor(Color.RED);
    turtle2.polygon(8, 50, turtle2);

    turtle3.letterA(140);

    gerald.letterB(140);

    world.setVisible(true);
  }
}
