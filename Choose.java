import java.io.IOException;
import javax.swing.*;

public class Choose {
    JFrame f;
    //JMenuBar mb;
    JMenu m;
    ImageIcon ico;
    JRadioButton img1;
    
    public Choose() throws IOException {
        f = new JFrame("Choose");
        f.setSize(500, 200);
        f.setLocation(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        m = new JMenu("Choose Image");
        
        //ico = new ImageIcon(ImageIO.read(new File("Desert.jpg")));
        
        img1 = new JRadioButton("desert", true);
        
       // img1 = ImageIO.read(new File("Desert.jpg"));
        f.setVisible(true);
       
       
        m.add(img1);  
        
        //f.setVisible(true);
    }
}