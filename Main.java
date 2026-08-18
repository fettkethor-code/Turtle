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

    System.out.println("turtle1" + turtle1.getBodyColor() + turtle1.getDistance(0, 0));
    System.out.println("turtle2" + turtle2.getBodyColor() + turtle2.getDistance(0, 0));
    System.out.println("turtle3" + turtle3.getBodyColor() + turtle3.getDistance(0, 0));
    System.out.println("gerald" + gerald.getBodyColor() + gerald.getDistance(0, 0));


    world.setVisible(true);
  }
}
