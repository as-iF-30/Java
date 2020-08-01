import javax.swing.*;
import java.awt.event.*;
public class SCal implements ActionListener
{
    JTextField t1,t2,t3;
    JButton b1,b2;
    SCal()
    {
        JFrame f=new JFrame("Calculator");
        JLabel l1=new JLabel("First Number");
        l1.setBounds(40,40,120,40);
        JTextField t1=new JTextField();
        t1.setBounds(160,40,40,40);
        JLabel l2= new JLabel("Second Number");
        l2.setBounds(40,160,120,40);
        JTextField t2 =new JTextField();
        t2.setBounds(160,160,40,40);
        JLabel l3=new JLabel("Answer");
        l3.setBounds(40,240,120,40);
        JTextField t3 =new JTextField();
        t3.setBounds(160,240,40,40);
        t3.setEditable(false);
        JButton b1=new JButton("+");
        b1.setBounds(80,300,50,50);
        JButton b2=new JButton("-");
        b2.setBounds(180,300,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(l1);f.add(l2);f.add(l3);
        f.add(t1);f.add(t2);f.add(t3);
        f.add(b1);f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=t1.getText();
        String s2=t2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        t3.setText(result);
    }
    public static void main(String []args)
    {
        new SCal();
    }
}