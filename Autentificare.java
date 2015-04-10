import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Autentificare {
    JFrame jf;
    JTextField jtf;
    JPasswordField pwd;
    JLabel l, l1;
    JButton b, ex, res, log;
    
    public Autentificare() {
    
        jf = new JFrame("Autentificare");
        jf.setSize(500, 200);
        jf.setLocation(300, 200);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l = new JLabel("Enter Username");
        l.setSize(l.getPreferredSize());
        l.setLocation(10,10);
        l.setBackground(Color.red);
        l.setForeground(Color.green);
        l.setOpaque(true);
        jf.add(l);
        
        jtf = new JTextField();
        jtf.setColumns(15);
        jtf.setSize(jtf.getPreferredSize());
        
        jtf.setLocation(150, 10);
        jtf.setToolTipText("Enter Username");
        jf.add(jtf);
        
        l1 = new JLabel("Enter Password");
        l1.setLocation(10,40);
        l1.setSize(l.getPreferredSize());
        l1.setBackground(Color.blue);
        l1.setForeground(Color.yellow);
        l1.setOpaque(true);
        jf.add(l1);
        
        pwd = new JPasswordField();
        pwd.setColumns(15);
        pwd.setSize(pwd.getPreferredSize());
        
        pwd.setLocation(150, 40);
        pwd.setToolTipText("Enter Password");
        jf.add(pwd);
        
        b = new JButton("OK");
        b.setSize(b.getPreferredSize());
        b.setLocation(150, 80);
        jf.add(b);
        
        ex = new JButton("EXIT");
        ex.setSize(60, 25);
        ex.setLocation(230, 80);
        jf.add(ex);
        
        res = new JButton("RESET");
        res.setSize(80, 25);
        res.setLocation(190, 110);
        jf.add(res);
        
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
              try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  String username = jtf.getText();
                  String password = pwd.getText();     
                  if(username.equals("narcis") && password.equals("narcis")){
                      Fereastra f = new Fereastra ("blur", "Desert.jpg");
                      jf.setVisible(false);
                  }      
              } catch (IOException ex) {
                   Logger.getLogger(Autentificare.class.getName()).log(Level.SEVERE, null, ex);
               }
            }

            
        });
        
        ex.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });
        
        res.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                l.setBackground(Color.green);
                l.setForeground(Color.red);
                l.setOpaque(true);
                
                l1.setBackground(Color.yellow);
                l1.setForeground(Color.blue);
                l1.setOpaque(true);
            }
        
        });
        
        jf.setVisible(true);        
    }
    
}
