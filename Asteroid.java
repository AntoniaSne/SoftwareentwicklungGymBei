import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Beschreiben Sie hier die Klasse Asteroid.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Asteroid extends JLabel implements KeyListener, Runnable{
    int y;
    int x;
    private JLabel asteroid;

    public Asteroid(int x,int y)
    {

        asteroid = new JLabel(new ImageIcon(getClass().getResource("Astronaut.png")));
        asteroid.setLocation(x,y);
        asteroid.setSize(400, 400);
        //asteroid.addKeyListener(this);
        //asteroid.setFocusable(true);

        //Fallen();
        run();
    }

    @Override   public void keyPressed(KeyEvent e) {

        
    } 

    void Fallen(){
        while(y <= 295){
            asteroid.setLocation(asteroid.getLocation().x -5, asteroid.getLocation().y-7);
            repaint();
            try
            {
                wait(500);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    JLabel GibAsteroid(){
        return asteroid;
    }
    
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
