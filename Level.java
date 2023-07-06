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
    private JLabel gameover;
    private Astronaut astronaut;
    private Asteroid asteroid;
    int a;
    int b;
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
        
        ImageIcon go = new ImageIcon("Gameover.png");
        gameover = new JLabel(go);
        gameover.setLocation(0,550);
        gameover.setSize(2000, 300);
        
        
        asteroid = new Asteroid(200, 100);
        astronaut= new Astronaut(0,295);
       
        astronaut.GibAstronaut().addKeyListener(this);
        astronaut.GibAstronaut().setFocusable(true);

        
        super.add(astronaut.GibAstronaut());
        super.add(asteroid.GibAsteroid());
        super.add(label2);
        super.add(label);
        super.add(gameover);
                
        run();
        
        super.setLayout(null);
        super.setSize(1100, 680);
        super.setVisible(true);
    }
     public void run() {

        label.setVisible(true);
        label2.setVisible(true);
        asteroid.setVisible(true);
    
    }
    public void GaOv() {

        label.setVisible(true);
        label2.setVisible(false);
        asteroid.setVisible(false);
        astronaut.setVisible(false);
    
    }
      @Override   public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
           astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x -10, astronaut.GibAstronaut().getLocation().y);
           GameOver();
           
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
           astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x + 10, astronaut.GibAstronaut().getLocation().y);
           GameOver();
           //if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            // astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x + 10, astronaut.GibAstronaut().getLocation().y);
            // GameOver();
        // }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
           astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x, astronaut.GibAstronaut().getLocation().y - 10);
           GameOver();
           // if (e.getKeyCode() == KeyEvent.VK_UP) {
            // astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x, astronaut.GibAstronaut().getLocation().y - 10);
            // GameOver();
        // }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
           astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x, astronaut.GibAstronaut().getLocation().y + 10);
           GameOver();
           // if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            // astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x, astronaut.GibAstronaut().getLocation().y + 10);
            // GameOver();
        // }
        }
        
        if(e.getKeyCode() == KeyEvent.VK_Q){
            
              
            
            try
            {
                System.out.println("Try 1");
                wait(1000);
                System.out.println("Try 2");
                astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x + 10, astronaut.GibAstronaut().getLocation().y); 
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
            
            // if(e.getKeyCode() == KeyEvent.VK_Q){

            // try
            // {
                // System.out.println("Try 1");
                // wait(1000);
                // System.out.println("Try 2");
                // astronaut.GibAstronaut().setLocation(astronaut.GibAstronaut().getLocation().x + 10, astronaut.GibAstronaut().getLocation().y); 
            // }
            // catch (InterruptedException ie)
            // {
                // ie.printStackTrace();
            // }

            // }
        }
        
        if (e.getKeyCode() == KeyEvent.VK_D) {
           asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x + 10, asteroid.GibAsteroid().getLocation().y);
           GameOver();
           // if (e.getKeyCode() == KeyEvent.VK_D) {
            // asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x + 10, asteroid.GibAsteroid().getLocation().y);
            // GameOver();
        // }
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
           asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x - 10, asteroid.GibAsteroid().getLocation().y);
           GameOver();
           // if (e.getKeyCode() == KeyEvent.VK_A) {
            // asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x - 10, asteroid.GibAsteroid().getLocation().y);
            // GameOver();
        // }
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
           asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x, asteroid.GibAsteroid().getLocation().y - 10);
           GameOver();
             // if (e.getKeyCode() == KeyEvent.VK_W) {
            // asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x, asteroid.GibAsteroid().getLocation().y - 10);
            // GameOver();
        // }
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
           asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x, asteroid.GibAsteroid().getLocation().y + 10);
           GameOver();
           // if (e.getKeyCode() == KeyEvent.VK_S) {
            // asteroid.GibAsteroid().setLocation(asteroid.GibAsteroid().getLocation().x, asteroid.GibAsteroid().getLocation().y + 10);
            // GameOver();
        // }

        
        }
        
        repaint();
        GameOver();
        

    }
     @Override public void keyReleased(KeyEvent e) {
        
    }

    @Override public void keyTyped(KeyEvent ke) {
        
    }
    
    public void GameOver(){
        if(astronaut.GibAstronaut() == asteroid.GibAsteroid()){
                System.out.println("GM");
                GaOv();
        }
        if(astronaut.GibAstronaut().getBounds().intersects(asteroid.GibAsteroid().getBounds())) {
             System.out.println(" overlaps!");

         }
        
    }
}
   



   

    // @Override   public void keyPressed(KeyEvent e) {

        
        // }
        // 
        
        

        

        
        
      
        
   