
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class StartButton extends JFrame{
    
    Container c;
    JLabel playerMode, p1, p2;
    Font f1, f2;
    JRadioButton rb1, rb2;
    ButtonGroup bg;
    JTextField tf1, tf2;
    JButton b;
    
    StartButton(){
        c = this.getContentPane();
        c.setLayout(null);
        
        f1 = new Font("Arial Rounded MT Bold", Font.BOLD, 22);
        f2 = new Font("Arial Rounded MT Bold", Font.BOLD, 20);
        
        
        playerMode = new JLabel("Select Player Mode");
        playerMode.setBounds(30, 150, 240, 50);
        playerMode.setFont(f1);
        c.add(playerMode);
        
        rb1 = new JRadioButton("With Computer");
        rb2 = new JRadioButton("2 Players");
        rb1.setBounds(50, 230, 200, 50);
        rb1.setFont(f2);
        rb2.setBounds(270, 230, 200, 50);
        rb2.setFont(f2);
        c.add(rb1);
        c.add(rb2);
        
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        
        b = new JButton("START");
        b.setBounds(280, 320, 140, 80);
        b.setFont(f2);
        c.add(b);
        
        //setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Player Options");
        setBounds(400, 200, 800, 700);
    } 
    
    public static void main(String[] args) {
        StartButton frame = new StartButton();
       // frame.setVisible(true);
        //ame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setTitle("Player Options");
        //frame.setBounds(400, 200, 800, 700);
        
        
    }

}
