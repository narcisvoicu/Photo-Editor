import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Fereastra extends JFrame {
    
    String filtru;
    String numeimagine;
    BufferedImage image;
    JLabel picLabel;
    
    public Fereastra (String filtru, String numeimag) throws IOException {
        super ("Filtre imagini");
        this.filtru = filtru;
        numeimagine = numeimag;
        
        setLayout(new BorderLayout());
        
        final JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel(new FlowLayout());
        
        JButton jb0 = new JButton ("Imaginea initiala");
        JButton jb1 = new JButton ("Filtrul Blur");
        JButton jb2 = new JButton ("Filtrul Color");
        JButton jb3 = new JButton ("Filtrul Edge Detection");
        JButton jb4 = new JButton ("Filtrul Grey");
        JButton jb5 = new JButton ("Filtrul Invert");
        JButton jb6 = new JButton ("Filtrul Sharpen");
        JButton jb7 = new JButton ("EXIT");
        
        image = ImageIO.read(new File(numeimagine));
        numeimagine = numeimagine.substring(0, numeimagine.length() - 4);
        
        jb0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    ImageIO.write(image, "jpg", new File (numeimagine + "_blurred.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(image));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                BlurFilter bf = new BlurFilter();
                try {
                    ImageIO.write(bf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(bf.processImage(image)));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ColorFilter cf = new ColorFilter();
                try {
                    ImageIO.write(cf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(cf.processImage(image)));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                EdgeDetectionFilter edf = new EdgeDetectionFilter();
                try {
                    ImageIO.write(edf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(edf.processImage(image)));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                GreyFilter gf = new GreyFilter();
                try {
                    ImageIO.write(gf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(gf.processImage(image)));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                InvertFilter invf = new InvertFilter();
                try {
                    ImageIO.write(invf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(invf.processImage(image)));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                SharpenFilter sf = new SharpenFilter();
                try {
                    ImageIO.write(sf.processImage(image), "jpg", new File (numeimagine + "_sharpen.jpg"));
                }
                catch (IOException exc) {
                    
                }
                picLabel = new JLabel(new ImageIcon(sf.processImage(image)));
                jp1.remove(0);
                jp1.add(picLabel);
                pack();
            }
        });
        
       jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        if (filtru.equals("blur")) {
            BlurFilter bf = new BlurFilter();
            ImageIO.write(bf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
            picLabel = new JLabel(new ImageIcon(bf.processImage(image)));
            jp1.add(picLabel);
        }
        if (filtru.equals("color")) {
            ColorFilter cf = new ColorFilter();
            ImageIO.write(cf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
            picLabel = new JLabel(new ImageIcon(cf.processImage(image)));
            jp1.add(picLabel);
        }
        if (filtru.equals("edge detection")) {
            EdgeDetectionFilter edf = new EdgeDetectionFilter();
            ImageIO.write(edf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
            picLabel = new JLabel(new ImageIcon(edf.processImage(image)));
            jp1.add(picLabel);
        }        
        if (filtru.equals("grey")) {
            GreyFilter gf = new GreyFilter();
            ImageIO.write(gf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
            picLabel = new JLabel(new ImageIcon(gf.processImage(image)));
            jp1.add(picLabel);
        }
        if (filtru.equals("invert")) {
            InvertFilter invf = new InvertFilter();
            ImageIO.write(invf.processImage(image), "jpg", new File (numeimagine + "_blurred.jpg"));
            picLabel = new JLabel(new ImageIcon(invf.processImage(image)));
            jp1.add(picLabel);
        }
        if (filtru.equals("sharpen")) {
            SharpenFilter sf = new SharpenFilter();
            ImageIO.write(sf.processImage(image), "jpg", new File (numeimagine + "_sharpen.jpg"));
            picLabel = new JLabel(new ImageIcon(sf.processImage(image)));
            jp1.add(picLabel);
        }
        jp2.add(jb0);
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        jp2.add(jb7);

        add(jp1, BorderLayout.NORTH);
        add(jp2, BorderLayout.CENTER);
        
        setVisible(true);
        pack();
    }
}
