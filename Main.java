import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);
   
     
    Turtle yertle = new Turtle(world);
    // Add your code here
    // Section 1

    for(int i = 0; i < 30; i++) {
        yertle.forward(1);
        yertle.turn(12);
    }
    // Section 2
    yertle.forward(30);
    yertle.turnRight();
    yertle.forward(30);
    yertle.turnRight();
    yertle.forward(30);
    yertle.turnRight();
    yertle.forward(30);
    yertle.penUp();
    yertle.turnRight();
    yertle.turnRight();
    yertle.forward(30);
    yertle.turnLeft();
    yertle.forward(5);
    yertle.turnRight();
    // Section 3
    yertle.penDown();
    yertle.forward(80);
    yertle.turn(45);
    yertle.forward(17);
    yertle.turn(45);
    yertle.forward(10);
    yertle.turn(45);
    yertle.forward(17);
    yertle.turn(45);
    yertle.forward(80);
    yertle.turnRight();
    yertle.forward(30);
    yertle.penUp();
    yertle.forward(700);
  
    world.setVisible(true);



    World world2 = new World(true);
     
    Turtle yertle2 = new Turtle(world2);
    // Add your code here
    yertle2.forward();
    yertle2.turnRight();
    yertle2.forward();

    World world3 = new World(true);
    Turtle yertle3 = new Turtle(world3);

    yertle3.forward();
    yertle3.turnRight();
    yertle3.forward();
    yertle3.turnRight();
    yertle3.forward();
    yertle3.turnRight();
    yertle3.forward();

  
    world.setVisible(true);

    //test for github
  }
}
