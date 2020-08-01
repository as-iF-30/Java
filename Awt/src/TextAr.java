import java.awt.*;
import java.awt.event.*;
public class TextAr extends Frame implements ActionListener{
    Label l1,l2;
    TextArea area;
    Button b;
    TextAr (){
        Frame f=new Frame();
        l1=new Label();
        l1.setBounds(50,50,100,30);
        l2=new Label();
        l2.setBounds(160,50,100,30);
        area=new TextArea();
        area.setBounds(20,100,300,300);
        b=new Button("Count Words");
        b.setBounds(100,400,100,30);
        b.addActionListener(this);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.add(l1);f.add(l2);f.add(area);f.add(b);
        f.setSize(400,450);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String text=area.getText();
        String words[]=text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+text.length());
    }
    public static void main(String[] args) {
        new TextAr ();
    }
}