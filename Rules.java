
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Rules extends JFrame {
    private JLabel rule1,rule2;
    private JTextArea jta;
    private JScrollPane jsp;
    private Container con;
    
    
    Rules()
    {
        con = this.getContentPane();
        con.setLayout(null);
        
        jsp = new JScrollPane();
        jsp.setBounds(5,5,770,840);
        jsp.setLayout(null);
        con.add(jsp);
        
        jta = new JTextArea("Rule 1:");
        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        jta.setBounds(5,5,770,850);
        jta.setEditable(false);
        jsp.add(jta);
        
                
       // setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200,50,800,900);
        setResizable(false);
        setTitle("Rules");
        
    }
    
    
    public static void main(String[] args) {
        Rules frame = new Rules();        
    }
    
}
