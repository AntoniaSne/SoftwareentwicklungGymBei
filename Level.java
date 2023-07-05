import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * Beschreiben Sie hier die Klasse Level.
 * 
 * @author Antonia 
 * @23.05.2023
 */

public class Level  extends JFrame implements KeyListener{
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
        
        //asteroid = new Asteroid(100, 100);
        astronaut= new Astronaut(0,295);
       
        astronaut.GibAstronaut().addKeyListener(this);
        astronaut.GibAstronaut().setFocusable(true);

        
        super.add(astronaut.GibAstronaut());
        //super.add(asteroid.GibAsteroid());
        super.add(label2);
        super.add(label);
        
                
        run();
        
        super.setLayout(null);
        super.setSize(1100, 680);
        super.setVisible(true);
    }
     public void run() {

        label.setVisible(true);
        label2.setVisible(true);
        //asteroid.setVisible(true);
    
    }
      @Override   public void keyPressed(KeyEvent e) {
        System.out.println("links");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
           astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x -10, astronaut.GibAstronaut().getLocation().y);
           System.out.println("links");
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
           astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x + 10, astronaut.GibAstronaut().getLocation().y);
        }
        
        repaint();
    }
     @Override public void keyReleased(KeyEvent e) {
        
    }

    @Override public void keyTyped(KeyEvent ke) {
        
    }
}
   