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
    private JButton start;
    private JTextArea textmail;
    private JTextArea textuser;
    private JTextArea punkte;
    private JTextField ausername;
    private JTextField rusername;
    private JTextField amail;
    private JTextField rmail;
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
        
        start = new JButton();
        start.setText("Start!");
        start.setSize(400,60);
        start.setFont(start.getFont().deriveFont(43f));
        start.setLocation(400,600);

        
        
        
        //username ist das obere Fenster der Anmeldung
        ausername = new JTextField();
        ausername.setSize(400,80);
        ausername.setLocation(400,100);
        ausername.setFont(ausername.getFont().deriveFont(40f));
        ausername.setEnabled(true);
        ausername.setBackground(new Color(0,0,255));
        ausername.setForeground(Color.BLACK);
        
        rusername = new JTextField();
        rusername.setSize(400,80);
        rusername.setLocation(400,100);
        rusername.setFont(rusername.getFont().deriveFont(40f));
        rusername.setEnabled(true);
        rusername.setBackground(new Color(0,0,255));
        rusername.setForeground(Color.BLACK);
        
        textuser = new JTextArea();
        textuser.setText("Username");
        textuser.setSize(300,70);
        textuser.setLocation(50,100);
        textuser.setFont(ausername.getFont().deriveFont(40f));
        textuser.setEnabled(true);
        textuser.setEditable(false);
        textuser.setForeground(Color.BLUE);
        textuser.setVisible(true);
        textuser.setBackground(new Color(0,255,0));
        
        // mail ist das untere Textfeld
        amail = new JTextField();
        amail.setSize(400,80);
        amail.setLocation(400,400);
        amail.setFont(ausername.getFont().deriveFont(40f));
        amail.setEnabled(true);
        amail.setBackground(new Color(0,0,255)); //hier wird Farbe des Textfeldhintergrunds gesetzt mit r,g,b werten gesetzt.
        amail.setForeground(Color.WHITE);
        
        // mail ist das untere Textfeld
        rmail = new JTextField();
        rmail.setSize(400,80);
        rmail.setLocation(400,400);
        rmail.setFont(ausername.getFont().deriveFont(40f));
        rmail.setEnabled(true);
        rmail.setBackground(new Color(0,0,255)); //hier wird Farbe des Textfeldhintergrunds gesetzt mit r,g,b werten gesetzt.
        rmail.setForeground(Color.WHITE);
        
        textmail = new JTextArea();
        textmail.setText("Mail");
        textmail.setSize(300,70);
        textmail.setLocation(50,400);
        textmail.setFont(ausername.getFont().deriveFont(40f));
        textmail.setEnabled(true);
        textmail.setEditable(false);
        textmail.setBackground(new Color(0,255,0));
        textmail.setForeground(Color.BLUE);
        
        punkte = new JTextArea();
        punkte.setText("Punkte:");
        punkte.setSize(300,70);
        punkte.setLocation(100,100);
        punkte.setFont(ausername.getFont().deriveFont(40f));
        punkte.setEnabled(true);
        punkte.setEditable(false);
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
        label3.setLocation(0,295);
        label3.setSize(300, 300);
        
        textuser = new JTextArea();
        textuser.setText("Username");
        textuser.setSize(300,70);
        textuser.setLocation(50,100);
        textuser.setFont(ausername.getFont().deriveFont(40f));
        textuser.setEnabled(true);
        textuser.setEditable(false);
        textuser.setForeground(Color.BLUE);
        textuser.setVisible(true);
        textuser.setBackground(new Color(0,255,0));
        
        
        anmeldung.addActionListener(this); 
        registrierung.addActionListener(this);
        start.addActionListener(this);        
        
        
        
        //Hinzufügen der Buttons         
        super.add(registrierung);
        super.add(anmeldung);
        super.add(ausername);
        super.add(amail);
        super.add(textmail);
        super.add(textuser);
        super.add(rmail);
        super.add(rusername);
        super.add(start);
        super.add(punkte);
        //labels

        super.add(label3);
        super.add(label2);
        super.add(label);
        
        
        
        //Generierung des Startfensters
        //Anmeldefenster();
        Startfenster();
        super.setLayout(null);
        super.setSize(1290, 750);
        super.setVisible(true);
        
        //Generieren des Anmeldefensters
       
        
        
    }
    
    public void Startfenster(){
        anmeldung.setVisible(true);
        registrierung.setVisible(true);
        amail.setVisible(false);
        ausername.setVisible(false);
        textuser.setVisible(false);
        textmail.setVisible(false);
        label.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        rmail.setVisible(false);
        rusername.setVisible(false);
        start.setVisible(false);
        punkte.setVisible(false);
        // anmeldung.setVisible(true);
        // registrierung.setVisible(true);
        // mail.setVisible(false);
        // username.setVisible(false);
        // textmail.setVisible(false);
        // textuser.setVisible(false);
        // label.setVisible(true);
        // label2.setVisible(true);
        // label3.setVisible(true);
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
        amail.setVisible(true);
        ausername.setVisible(true);
        textmail.setVisible(true);
        textuser.setVisible(true);
        rmail.setVisible(false);
        rusername.setVisible(false);
        start.setVisible(true);
        punkte.setVisible(false);
        
    }
    public void Registrierungsfenster(){
        label.setVisible(true);
        label2.setVisible(false);
        label3.setVisible(false);
        anmeldung.setVisible(false);
        registrierung.setVisible(false);
        amail.setVisible(false);
        ausername.setVisible(false);
        textmail.setVisible(true);
        textuser.setVisible(true);
        rmail.setVisible(true);
        rusername.setVisible(true);
        start.setVisible(true);
        punkte.setVisible(false);
    }
    public void Start(){
        label.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        anmeldung.setVisible(false);
        registrierung.setVisible(false);
        amail.setVisible(false);
        ausername.setVisible(false);
        textmail.setVisible(false);
        textuser.setVisible(false);
        rmail.setVisible(false);
        rusername.setVisible(false);
        start.setVisible(false);
        punkte.setVisible(false);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == anmeldung){
            
            Anmeldefenster();
        }
        else{ if(e.getSource() == registrierung){
                Registrierungsfenster();
                }
        else{if(e.getSource() == start){
                Start();
                }
        
        }
        }
    }   
    }