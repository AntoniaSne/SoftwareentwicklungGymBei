import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Beschreiben Sie hier die Klasse AnmeldeBildschirm.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AnmeldeBildschirm extends JFrame implements ActionListener
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
        
        super.add(registrierung);
        super.add(anmeldung);
        
        
        
        Startfenster();
        
        super.setLayout(null);
        super.setSize(1290, 750);
        super.setVisible(true);
        
    }
    
    public void Startfenster(){
        anmeldung.setVisible(true);
        registrierung.setVisible(true);

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
