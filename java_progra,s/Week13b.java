import java.awt.*;
import javax.swing.*;
public class scrollEx
{
    JFrame f;
    scrollEx()
    {
    f=new JFrame();
    JPanel jp=new JPanel();
    jp.setLayout(new GridLayout(20,20));
    for(int i=0;i<20;i++)
        jp.add(new Button("Buton"+i));
    JScrollPane js=new JScrollPane(jp);
    f.add(js,BorderLayout.CENTER);
    f.setSize(300,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
    }
    public static void main(String[] arge)
    {
    new scrollEx();
    }
}
