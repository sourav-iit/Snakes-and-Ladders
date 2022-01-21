//package swing_program;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class HomeScreen extends JFrame implements ActionListener {
    
private Container c;
private JButton Bt1,Bt2,Bt3;
private ImageIcon img;
private JLabel imglabel, title;
Font f1, f2;
                    
    HomeScreen()
	{
    FrameMethod();
    this.setExtendedState(MAXIMIZED_BOTH);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void FrameMethod(){
        c=this.getContentPane();
        c.setBackground(Color.decode("#b35900"));
        c.setLayout(null);
        
        f1 = new Font("Arial Rounded MT Bold", Font.BOLD, 120);
        f2 = new Font("Arial Rounded MT Bold", Font.BOLD, 30);
        
                 
        title = new JLabel("SNAKES AND LADDERS");
        title.setFont(f1);
        title.setForeground(Color.decode("#40ff00"));
        title.setBounds(210,10,1800,180);
        c.add(title);
                 
Bt1=new JButton("Play");

Bt1.setBounds(1020,470,200,60);
Bt1.setFont(f2);
c.add(Bt1);
Bt2=new JButton("Help");
Bt2.setFont(f2);
Bt2.setBounds(1270,470,200,60);
 c.add(Bt2);
Bt3=new JButton("Exit");
Bt3.setBounds(1520,470,200,60);
Bt3.setFont(f2);
Bt3.setBackground(Color.red);
Bt3.addActionListener(this);
c.add(Bt3);


img=new ImageIcon(getClass().getResource("bb.JPG"));
imglabel=new JLabel(img);
imglabel.setBounds(150,180,800,800);
c.add(imglabel);

Bt1.addActionListener(this);
Bt2.addActionListener(this);
}

    public static void main(String[] args) {
    HomeScreen frame=new HomeScreen();
    frame.setTitle("How to Create JFrame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Bt1){
            StartButton sb = new StartButton();
            sb.setVisible(true);
        }
        if(e.getSource()==Bt2){
            HelpButton help = new HelpButton();
            help.setVisible(true);
        }
        if(e.getSource()==Bt3){
            System.exit(0);
        }
        //System.exit(0);
    }

}
