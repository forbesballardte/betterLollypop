import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Write a description of class Lollipop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lollipop
{
    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    private void drawLollipop() {
        UI.setLineWidth(10);
        UI.drawLine(300, 200, 300, 400);
        UI.setLineWidth(1);
        UI.setColor(Color.red);
        UI.fillOval(260, 160, 80, 80);
    }
    
    public static void main(String[] args) {
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }
}
