import java.awt.*;
import java.awt.event.*;
public class Asr extends Frame implements ActionListener
{
    Frame f;
    TextField tf1,tf2,tf3;
    Button b1,b2;
    Label l1,l2,l3;
    Asr()
    {
        f=new Frame("Caclulator");
        l1=new Label("First Number");
        l1.setBounds(40,40,120,40);
        l2=new Label("Second Number");
        l2.setBounds(40,120,120,40);
        l3=new Label("Anwser");
        l3.setBounds(40,200,120,40);
        tf1=new TextField();
        tf1.setBounds(220,40,40,40);
        tf2=new TextField();
        tf2.setBounds(220,120,40,40);
        tf3=new TextField();
        tf3.setBounds(220,200,40,40);
        b1 =new Button("+");
        b1.setBounds(80,300,50,50);
        b2=new Button("-");
        b2.setBounds(180,300,50,50);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(l1);f.add(l2);f.add(l3);
        f.add(tf1);f.add(tf2);f.add(tf3);
        f.add(b1);f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String []args)
    {
        new Asr();
    }
}