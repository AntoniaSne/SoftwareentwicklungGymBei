import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * Beschreiben Sie hier die Klasse Astronaut.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Astronaut extends JLabel implements KeyListener
{
    public int x;
    int y;
    private JLabel astronaut;

    public Astronaut(int x,int y)
    {
        
        
        astronaut = new JLabel(new ImageIcon(getClass().getResource("Astronaut.png")));
        astronaut.setLocation(x,y);
        astronaut.setSize(300, 300);
        astronaut.addKeyListener(this);
        astronaut.setFocusable(true);
    }
    @Override   public void keyPressed(KeyEvent e) {
        System.out.println("links");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
           astronaut.setLocation(astronaut.getLocation().x -10, astronaut.getLocation().y);
           System.out.println("links");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
           astronaut.setLocation(astronaut.getLocation().x + 10, astronaut.getLocation().y);
        }
        
        repaint();
    }
     @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    

    JLabel GibAstronaut(){
        return astronaut;
    }
}