import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;


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
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    
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
        
        

        
        
        
        //username ist das obere Fenster der Anmeldung
        username = new JTextField();
        username.setSize(400,80);
        username.setLocation(400,100);
        username.setFont(username.getFont().deriveFont(40f));
        username.setEnabled(true);
        username.setBackground(new Color(0,0,255));
        username.setForeground(Color.BLACK);
        
        
        textuser = new JTextArea();
        textuser.setText("Username");
        textuser.setSize(300,70);
        textuser.setLocation(50,100);
        textuser.setFont(username.getFont().deriveFont(40f));
        textuser.setEnabled(true);
        textuser.setEditable(false);
        textuser.setForeground(Color.BLUE);
        textuser.setVisible(true);
        textuser.setBackground(new Color(0,255,0));
        
        // mail ist das untere Textfeld
        mail = new JTextField();
        mail.setSize(400,80);
        mail.setLocation(400,400);
        mail.setFont(username.getFont().deriveFont(40f));
        mail.setEnabled(true);
        mail.setBackground(new Color(0,0,255)); //hier wird Farbe des Textfeldhintergrunds gesetzt mit r,g,b werten gesetzt.
        mail.setForeground(Color.WHITE);
        
        textmail = new JTextArea();
        textmail.setText("Mail");
        textmail.setSize(300,70);
        textmail.setLocation(50,400);
        textmail.setFont(username.getFont().deriveFont(40f));
        textmail.setEnabled(true);
        textmail.setEditable(false);
        textmail.setBackground(new Color(0,255,0));
        textmail.setForeground(Color.BLUE);
        
        //images
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
        
        textuser = new JTextArea();
        textuser.setText("Username");
        textuser.setSize(300,70);
        textuser.setLocation(50,100);
        textuser.setFont(username.getFont().deriveFont(40f));
        textuser.setEnabled(true);
        textuser.setEditable(false);
        textuser.setForeground(Color.BLUE);
        textuser.setVisible(true);
        textuser.setBackground(new Color(0,255,0));
        
        
        anmeldung.addActionListener(this); 
        registrierung.addActionListener(this);
                
        
        
        
        //Hinzufügen der Buttons         
        super.add(registrierung);
        super.add(anmeldung);
        super.add(username);
        super.add(mail);
        super.add(textmail);
        super.add(textuser);
        
        //labels
        super.add(label3);
        super.add(label2);
        super.add(label);
        
        
        
        //Generierung des Startfensters
        Anmeldefenster();
       // Startfenster();
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
        label.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
    }
    
    public void Anmeldefenster(){
        // registrierung.setVisible(false);
        // mail.setVisible(true);
        // username.setVisible(true);
        // textmail.setVisible(true);
        // textuser.setVisible(true);
        label.setVisible(true);
        label2.setVisible(false);
        label3.setVisible(false);
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
