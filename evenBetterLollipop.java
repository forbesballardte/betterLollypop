import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Write a description of class evenBetterLollipop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class evenBetterLollipop
{
    public static final double X = 300.0;   //horizontal center of Lollipop
    public static final double Y = 180.0;   //vertical center of lollipop
    public static final double SIZE = 80.0;     //diameter of Lollipop
    public static final double STICK = 200.0;   // length of lollipop stick
    
    /**
     * Constructor for objects of class evenBetterLollipop
     */
    public evenBetterLollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    private void drawLollipop() {
        double left = X - SIZE/2.0;
        double right = Y - SIZE/2.0;
        double bottom = Y + STICK;
        
        UI.setLineWidth(SIZE/8.0);
        UI.drawLine(X, Y, X, bottom);
        UI.setLineWidth(1);
        UI.setColor(Color.red);
        UI.fillOval(left, right, SIZE, SIZE);
    }
    
    public static void main(String[] args) {
        evenBetterLollipop obj = new evenBetterLollipop();
        obj.drawLollipop();
    }
}
