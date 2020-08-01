import java.awt.*;
import java.awt.event.*;
class Awt1 extends Frame implements ActionListener
{
    Frame f=new Frame();
    TextField tf;
    Awt1()
    {
        Frame f=new Frame("Asif");
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
    f.addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent e)
          {
               f.dispose();
           }
        });
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome");
    }
    public static void main(String args[])
    {
        new Awt1();
    }
}
