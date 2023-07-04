import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;

/**
 * Beschreiben Sie hier die Klasse Level.
 * 
 * @author Antonia 
 * @23.05.2023
 */

public class Level  extends JFrame implements Runnable{
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private Astronaut astronaut;
    private Asteroid asteroid;
    
    public Level()
    {
        ImageIcon hintergrund = new ImageIcon ("Weltraum_hintergrund.png");    
        label = new JLabel(hintergrund);
        label.setLocation(-130,-70);
        label.setSize(1400, 787);
        
        ImageIcon untergrund = new ImageIcon ("Untergrund.png");
        label2 = new JLabel(untergrund);
        label2.setLocation(0,550);
        label2.setSize(2000, 300);
        
        asteroid = new Asteroid(100, 100);
        astronaut= new Astronaut(0,295);
       
        
        super.add(astronaut.GibAstronaut());
        super.add(asteroid.GibAsteroid());
        super.add(label2);
        super.add(label);
        
        run();
        
        super.setLayout(null);
        super.setSize(1100, 680);
        super.setVisible(true);
    }
     public void run() {

        label.setVisible(false);
        label2.setVisible(false);
        asteroid.setVisible(true);
    
    }
}
   