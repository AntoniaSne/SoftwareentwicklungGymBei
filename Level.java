import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;


/**
 * Beschreiben Sie hier die Klasse Level.
 * 
 * @author Antonia 
 * @23.05.2023
 */

public class Level  extends JFrame{
    private JLabel label;
    private JLabel label2;
    
    public Level()
    {
        ImageIcon hintergrund = new ImageIcon ("Weltraum_hintergrund.png");
        ImageIcon untergrund = new ImageIcon ("Untergrund.png");
        
        label = new JLabel(hintergrund);
        label.setLocation(-130,-70);
        label.setSize(1400, 787);
        
        label2 = new JLabel(untergrund);
        label2.setLocation(0,0);
        label2.setSize(200, 300);
        
        super.add(label);
        super.add(label2);
        
        FensterAufbauenV1();
        
        super.setLayout(null);
        super.setSize(1100, 680);
        super.setVisible(true);
    }
     public void FensterAufbauenV1() {

        label.setVisible(true);
        

    }
}