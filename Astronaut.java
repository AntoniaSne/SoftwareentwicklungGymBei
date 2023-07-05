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

public class Astronaut extends JLabel 
{
    int a;
    int b;
    private JLabel astronaut;

    public Astronaut(int a,int b)
    {
        
        
        astronaut = new JLabel(new ImageIcon(getClass().getResource("Astronaut.png")));
        astronaut.setLocation(a,b);
        astronaut.setSize(300, 300);
        
    }
    
    

    JLabel GibAstronaut(){
        return astronaut;
    }
}