import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.BorderLayout;;
import java.awt.Color;

class CustomLayout
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Custom Layout");
        LayoutManager Custom = new BorderLayout();
        frame.setLayout(null);
        Label label = new Label("Hello, Custom Layout!");
        label.setBackground(Color.BLUE);
        label.setForeground(Color.WHITE);
        label.setBounds(397, 300 , 200,70);
        frame.setBackground(Color.cyan);
        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}

