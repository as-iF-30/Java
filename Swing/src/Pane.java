import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pane {
    JFrame f = new JFrame();
    Pane()
    {
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
    public void Pane1() {
        JOptionPane.showMessageDialog(f, "asif");
    }

    public void Pane2() {
        JOptionPane.showMessageDialog(f, "Successfully Updated.", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public void Pane3() {
        String s1 = JOptionPane.showInputDialog(f, "Enter");
    }

    public void Pane4()
    {
         f.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 int a=JOptionPane.showConfirmDialog(f,"Are u Sure");
                 if(a==JOptionPane.YES_OPTION)
                 {
                     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 }
             }
         });
    }
    public static void main(String []args)
    {
        Pane o=new Pane();
        o.Pane1();
        o.Pane2();
        o.Pane3();
        o.Pane4();

    }
}