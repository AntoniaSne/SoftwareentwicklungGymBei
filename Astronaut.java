import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyListener;

/**
 * Beschreiben Sie hier die Klasse Astronaut.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Astronaut
{
    private JLabel label3;
    
    
    public Astronaut()
    {
        
        ImageIcon astronaut = new ImageIcon ("Astronaut.png");
        label3 = new JLabel(astronaut);
        label3.setLocation(0,295);
        label3.setSize(300, 300);
        
        
    }
    void SonderTasteGedrückt(char taste){
        switch(taste){
            case 'd':
                label3.move(30,0);
                break;
            case 40:
                
                break;
        }
    }
    JLabel GibAstronaut(){
        return label3;
    }
}