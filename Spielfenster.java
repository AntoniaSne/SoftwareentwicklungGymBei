import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


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
    private JTextArea textmail;
    private JTextArea textuser;
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
        
        //username ist das obere Fenster
        username = new JTextField();
        username.setSize(400,80);
        username.setLocation(400,100);
        username.setFont(username.getFont().deriveFont(40f));
        username.setEnabled(true);
        
        textuser = new JTextArea();
        textuser.setText("Username");
        textuser.setSize(300,70);
        textuser.setLocation(50,100);
        textuser.setFont(username.getFont().deriveFont(40f));
        textuser.setEnabled(true);
        textuser.setEditable(false);
        
        // mail ist das untere Textfeld
        mail = new JTextField();
        mail.setSize(400,80);
        mail.setLocation(400,400);
        mail.setFont(username.getFont().deriveFont(40f));
        mail.setEnabled(true);
        
        textmail = new JTextArea();
        textmail.setText("Mail");
        textmail.setSize(300,70);
        textmail.setLocation(50,400);
        textmail.setFont(username.getFont().deriveFont(40f));
        textmail.setEnabled(true);
        textmail.setEditable(false);
        
        //Hinzufügen der Buttons         
        super.add(registrierung);
        super.add(anmeldung);
        super.add(username);
        super.add(mail);
        super.add(textmail);
        super.add(textuser);
        
        
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
        textmail.setVisible(false);
        textuser.setVisible(false);
    }
    
    public void Anmeldefenster(){
        anmeldung.setVisible(false);
        registrierung.setVisible(false);
        mail.setVisible(true);
        username.setVisible(true);
        textmail.setVisible(true);
        textuser.setVisible(true);
    }
    public void Registrierungsfenster(){
        anmeldung.setVisible(false);
        registrierung.setVisible(false);
        mail.setVisible(false);
        username.setVisible(false);
        textmail.setVisible(true);
        textuser.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == anmeldung){
            
            Anmeldefenster();
        }
        else{ if(e.getSource() == registrierung){
                Registrierungsfenster();
                }
        }
    }
}
