import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 * Beschreiben Sie hier die Klasse Spielfenster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielfenster extends JFrame implements ActionListener
{
    private JButton anmeldung;
    private JButton registrierung;
    
    private JTextField username;
    private JTextField mail;
    Spielfenster(){
        //Anmeldebutton
        anmeldung = new JButton();
        anmeldung.setText("Anmeldung");
        anmeldung.setSize(400,80);
        anmeldung.setFont(anmeldung.getFont().deriveFont(46f));
        anmeldung.setEnabled(true);
        anmeldung.setLocation(400,100);
        
        //Registrierungsbutton
        registrierung = new JButton();
        registrierung.setText("Registrierung");
        registrierung.setSize(400,80);
        registrierung.setFont(registrierung.getFont().deriveFont(46f));
        registrierung.setLocation(400,300);
        
         username = new JTextField();
        username.setSize(400,80);
        username.setLocation(400,100);
        username.setFont(username.getFont().deriveFont(40f));
        username.setEnabled(true);
        
        mail = new JTextField();
        mail.setSize(400,80);
        mail.setLocation(400,400);
        mail.setFont(username.getFont().deriveFont(40f));
        mail.setEnabled(true);
        
        
        
        //Hinzufügen der Buttons         
        super.add(registrierung);
        super.add(anmeldung);
        super.add(username);
        super.add(mail);
        
        anmeldung.addActionListener(this); 
        registrierung.addActionListener(this);
        
        
        //Generierung des Startfensters
        Startfenster();
        
        super.setLayout(null);
        super.setSize(1290, 750);
        super.setVisible(true);
        
        //Generieren des Anmeldefensters
        
        
        
        
        
        
        
    }
    
    public void Startfenster(){
        anmeldung.setVisible(true);
        registrierung.setVisible(true);
        mail.setVisible(false);
        username.setVisible(false);
    }
    
    public void Anmeldefenster(){
        anmeldung.setVisible(false);
        registrierung.setVisible(false);
        mail.setVisible(true);
        username.setVisible(true);
        
    }
    public void Registrierungsfenster(){
        anmeldung.setVisible(false);
        registrierung.setVisible(false);
        mail.setVisible(false);
        username.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == anmeldung){
            System.out.println("bis hier und nicht weiter");
            Anmeldefenster();
        }
        else{ if(e.getSource() == registrierung){
                Registrierungsfenster();
                }
        }
    }
}
