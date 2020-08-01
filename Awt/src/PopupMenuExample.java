import java.awt.*;
import java.awt.event.*;
class PopupMenuExample
{
    PopupMenuExample(){
        Frame f= new Frame("PopupMenu Example");
        PopupMenu pm = new PopupMenu("Edit");
        MenuItem I1= new MenuItem("Cut");
        //I1.setActionCommand("Cut");
        MenuItem I2 = new MenuItem("Copy");
        //I2.setActionCommand("Copy");
        MenuItem I3 = new MenuItem("Paste");
        //I3.setActionCommand("Paste");
        pm.add(I1);
        pm.add(I2);
        pm.add(I3);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm.show(f , e.getX(), e.getY());
            }
        });
        f.add(pm);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
    public static void main(String args[])
    {
        new PopupMenuExample();
    }
}