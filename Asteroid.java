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
public class Asteroid extends JLabel{
    int y;
    int x;
    private JLabel asteroid;

    public Asteroid(int x,int y)
    {

        asteroid = new JLabel(new ImageIcon(getClass().getResource("Asteroid.png")));
        asteroid.setLocation(x,y);
        asteroid.setSize(400, 400);
        //asteroid.addKeyListener(this);
        //asteroid.setFocusable(true);

        //Fallen();
        
    }

    JLabel GibAsteroid(){
        return asteroid;
    }
    
    
}
