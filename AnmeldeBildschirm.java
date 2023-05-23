import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Beschreiben Sie hier die Klasse AnmeldeBildschirm.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AnmeldeBildschirm
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private JButton anmeldung;
    private JButton registrierung;
    
    /**
     * Konstruktor für Objekte der Klasse AnmeldeBildschirm
     */
    public AnmeldeBildschirm()
    {
        anmeldung = new JButton();
        anmeldung.setText("Anmeldung");
        anmeldung.setSize(400,80);
        anmeldung.setFont(anmeldung.getFont().deriveFont(46f));
        anmeldung.setEnabled(true);
        anmeldung.setLocation(400,100);
        
        registrierung = new JButton();
        registrierung.setText("Registrierung");
        registrierung.setSize(400,80);
        registrierung.setFont(registrierung.getFont().deriveFont(46f));
        registrierung.setLocation(400,300);
        
        
    }
    
    public void Startfenster(){
        anmeldung.setVisible(true);
        registrierung.setVisible(true);
    }
    
}
