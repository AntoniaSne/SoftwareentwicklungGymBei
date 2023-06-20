import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

/**
 * Beschreiben Sie hier die Klasse Astronaut.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Astronaut //implements KeyListener
{
    public int x;
    int y;
    public JLabel label3;

    public Astronaut(int x,int y)
    {
        x = 0;
        y = 295;
        ImageIcon astronaut = new ImageIcon ("Astronaut.png");
        label3 = new JLabel(astronaut);
        label3.setLocation(x,y);
        label3.setSize(300, 300);
        label3.addKeyListener(new KeyAdapter(){
                @Override
                public void keyPressed(KeyEvent label){
                    
                    if(label.getKeyCode()==KeyEvent.VK_RIGHT) {
                        
                        Erhoehex();
                        
                        System.out.println("vorwärts");
                        AktualisierePosition();
                    }

                }
            });
        }
    public void AktualisierePosition(){
        label3.setLocation(x,y);
    }
    public void Erhoehex(){
            x= x+5;
    }
        public void keyPressed(KeyEvent e) {
        System.out.println("Taste: " + e.getKeyChar() + ", Code: " + e.getKeyCode());
        System.out.println("Tastenposition: " + e.getKeyLocation());
        System.out.println("---");
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