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

public class Level  extends JFrame{
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    
    public Level()
    {
        ImageIcon hintergrund = new ImageIcon ("Weltraum_hintergrund.png");
        
        
        
        label = new JLabel(hintergrund);
        label.setLocation(-130,-70);
        label.setSize(1400, 787);
        
        ImageIcon untergrund = new ImageIcon ("Untergrund.png");
        label2 = new JLabel(untergrund);
        label2.setLocation(20,550);
        label2.setSize(200, 300);
        
        ImageIcon astronaut = new ImageIcon ("Astronaut.png");
        label3 = new JLabel(astronaut);
        label3.setLocation(50,200);
        label3.setSize(500, 200);
        
        super.add(label3);
        super.add(label2);
        super.add(label);
        
        FensterAufbauenV1();
        
        super.setLayout(null);
        super.setSize(1100, 680);
        super.setVisible(true);
    }
     public void FensterAufbauenV1() {

        label.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
    }
    public static void main(String[] args) {
       
       
        JFrame Hauptmenü = new JFrame("Drag and Play");
       
        try {
           
            Hauptmenü.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Java/Drag and Play/Sources/Hauptmenü.jpg")))));
           
        }catch(IOException e)
        {
            System.out.println("Image not found");
        }
       
        Dimension screensize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
       
       
        System.out.println(screensize);
        Hauptmenü.setResizable(false);
        Hauptmenü.setSize(screensize);
        Hauptmenü.setVisible(true);
    }
}