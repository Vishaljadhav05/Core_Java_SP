import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;


/* 
public class G_ActionListener1 implements java.awt.event.ActionListener
{
    JButton jb;
    JFrame jf;
     G_ActionListener1()
    {
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jb = new JButton("Click Me");
        jb.addActionListener(this);
        jb.setBounds(100,100,100,100);
        jf.add(jb);


        jf.setVisible(true);

    }
    public static void main(String[] args) 
    {
       new G_ActionListener1();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == jb)
        {
            JOptionPane.showMessageDialog(jf, "Button clicked");
        }
    }
}

 */

/*
public class G_ActionListener1
{
    JButton jb;
    JFrame jf;
     G_ActionListener1()
    {
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jb = new JButton("Click Me");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 if(e.getSource() == jb)
                {
                    JOptionPane.showMessageDialog(jf, "Button clicked");
                }
            }
        });
        jb.setBounds(100,100,100,100);
        jf.add(jb);


        jf.setVisible(true);

    }
    public static void main(String[] args) 
    {
       new G_ActionListener1();
    }   
}

*/


// Using Lambda Expresssion

public class G_ActionListener1
{
    JButton jb;
    JFrame jf;
     G_ActionListener1()
    {
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        jb = new JButton("Click Me");
        jb.addActionListener(
            (e) -> {  JOptionPane.showMessageDialog(jf, "Button clicked by lambda");   }
            );

        jb.setBounds(100,100,100,100);
        jf.add(jb);


        jf.setVisible(true);

    }
    public static void main(String[] args) 
    {
       new G_ActionListener1();
    }   
}