
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class HelpButton extends JFrame implements ActionListener{
    
    Container c;
    JButton rules, about;
    Font f1;
    
    
    HelpButton(){
    c = this.getContentPane();
    c.setLayout(null);
    
        f1 = new Font("Arial Rounded MT Bold", Font.BOLD, 30);
        
        rules = new JButton("Rules");
        about = new JButton("About");
        rules.setFont(f1);
        about.setFont(f1);
        rules.setBounds(100, 100, 200, 60);
        about.setBounds(100, 200, 200, 60);
        
        c.add(rules);
        c.add(about);
        
                //setVisible(true);
            setBounds(300, 200, 500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Help");
        
        rules.addActionListener(this);
        about.addActionListener(this);
    }
    
    public static void main(String[] args) {
        HelpButton frame = new HelpButton();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            Rules r = new Rules();
            r.setVisible(true);
        }
        if(e.getSource()==about){
            about a = new about();
            a.setVisible(true);
        }
    }
    
}
