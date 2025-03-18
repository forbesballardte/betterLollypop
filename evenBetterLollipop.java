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
    
    /**
     * Constructor for objects of class evenBetterLollipop
     */
    public evenBetterLollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    public void doDrawLollipop() {
        double size = UI.askDouble("Diameter: ");
        double stickHeight = UI.askDouble("Stick Height: ");
        drawLollipop(300.0, 180.0, size, stickHeight);
    }
    
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x - size/2.0;
        double right = y - size/2.0;
        double bottom = y + stick;
        
        UI.setLineWidth(size/8.0);
        UI.drawLine(x, y, x, bottom);
        UI.setLineWidth(1);
        UI.setColor(Color.red);
        UI.fillOval(left, right, size, size);
    }
    
    public static void main(String[] args) {
        evenBetterLollipop obj = new evenBetterLollipop();
        obj.doDrawLollipop();
    }
}
