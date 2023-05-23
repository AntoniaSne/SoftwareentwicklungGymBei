import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 * Beschreiben Sie hier die Klasse Anmeldung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Anmeldung extends JFrame implements ActionListener
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private JTextField username;
    private JTextField mail;
    /**
     * Konstruktor für Objekte der Klasse Anmeldung
     */
    public Anmeldung()
    {
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
        
        super.add(username);
        super.add(mail);
        
        
        Anmeldung();
        
        super.setLayout(null);
        super.setSize(1290, 750);
        super.setVisible(true);
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void Anmeldung()
    {
        username.setVisible(true);
        mail.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        // if(e.getSource() == button){
            // String name = eingabe.getText();
            // label.setText("Die Schlange heißt " + name + "!");
        // }
        // else{ if(e.getSource() == Starten){
                // label.setText("Starten");
                // FensterAufbauenV2();
                // }
        // }
    }
}
