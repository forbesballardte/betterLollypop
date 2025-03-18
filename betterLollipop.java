import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Write a description of class betterLollipop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class betterLollipop
{
    public static final double X = 300.0;   //horizontal center of Lollipop
    public static final double Y = 180.0;   //vertical center of lollipop
    public static final double SIZE = 80.0;     //diameter of Lollipop
    public static final double STICK = 200.0;   // length of lollipop stick
    
    /**
     * Constructor for objects of class betterLollipop
     */
    public betterLollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    private void drawLollipop() {
        UI.setLineWidth(SIZE/8.0);
        UI.drawLine(X, Y, X, Y + STICK);
        UI.setLineWidth(1);
        UI.setColor(Color.red);
        UI.fillOval(X - SIZE/2.0, Y - SIZE/2.0, SIZE, SIZE);
    }
    
    public static void main(String[] args) {
        betterLollipop obj = new betterLollipop();
        obj.drawLollipop();
    }
}
