import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MenuExample extends Frame
{
    MenuExample() {
        Frame f = new Frame("Menu and MenuItem Example");
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu");
        Menu sm = new Menu("Sub Menu");
        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        sm.add(i4);
        sm.add(i5);
        m.add(sm);
        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(400, 400);
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
        new MenuExample();
    }
}