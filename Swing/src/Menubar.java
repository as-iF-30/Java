import javafx.scene.input.KeyEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menubar
{
    Menubar()
    {
        JFrame f=new JFrame("Asif");
        JMenuBar mb =new JMenuBar();
        JMenu m1 = new JMenu("File");
       // m1.setMnemonic(KeyEven);
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Option_1");
        JMenu i3 = new JMenu("Save");
        JMenuItem i4 = new JMenuItem("new Save");
        JMenuItem i5 = new JMenuItem("Save as");
        JMenu m2 = new JMenu("Edit");
        JMenuItem i6 = new JMenuItem("Cut");
        JMenuItem i7 = new JMenuItem("Copy");
        JMenuItem i8 = new JMenuItem("Paste");
        JMenu m3 = new JMenu("Help");
        JMenuItem i9 = new JMenuItem("Call Police");
        JMenuItem i10 = new JMenuItem("Call Ambulance");
        JMenuItem i11 = new JMenuItem("Call Firebriged");
        JPopupMenu p = new JPopupMenu("Else");
        JMenuItem i12 = new JMenuItem("Eeditc");
        JMenuItem i13 =  new JMenuItem("Eeditp");
        JMenuItem i14 = new JMenuItem("Eeditco");
        p.add(i12); p.add(i13); p.add(i14);
        m1.add(i1);m1.add(i2);m1.add(cm);
        m1.addSeparator();
        i3.add(i4);i3.add(i5);
        m1.add(i3);
        m2.add(i6);m2.add(i7);m2.add(i8);
        m3.add(i9);m3.add(i10);m3.add(i11);
        mb.add(m1);mb.add(m2);mb.add(m3);
        DefaultMutableTreeNode t = new DefaultMutableTreeNode("Desktop");
        DefaultMutableTreeNode t1 =new DefaultMutableTreeNode("Downloads");
        DefaultMutableTreeNode t2 = new DefaultMutableTreeNode("Recycle BIn");
        DefaultMutableTreeNode t3 = new DefaultMutableTreeNode("by date");
        DefaultMutableTreeNode t4 = new DefaultMutableTreeNode("by name");
        t.add(t1);t.add(t4);
        t1.add(t2);t1.add(t3);
        JTree jt =new JTree(t);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                p.show(f,e.getX(),e.getY());
            }
        });
        f.add(jt);
        f.add(p);
        f.add(mb);
        f.setSize(400,400);
        f.setVisible(true);
        f.add(jt, BorderLayout.CENTER);
        f.setJMenuBar(mb);
    }
    public static void main(String []args)
    {

        new Menubar();
    }
}