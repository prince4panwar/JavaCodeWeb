import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTChoiceWithCustomLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        CustomFrame frame = new CustomFrame("AWT Choice with Custom Layout Example");

        // Create a Choice component
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Add the Choice component to the frame using the custom layout
        frame.add(choice);

        // Add a window listener to handle closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}

class CustomFrame extends Frame {
    public CustomFrame(String title) {
        super(title);
        setLayout(new CustomFlowLayout());
    }
}

class CustomFlowLayout extends FlowLayout {
    @Override
    public void layoutContainer(java.awt.Container target) {
        int centerX = (target.getWidth() - target.getComponent(0).getPreferredSize().width) / 2;
        int centerY = (target.getHeight() - target.getComponent(0).getPreferredSize().height) / 2;

        target.getComponent(0).setBounds(centerX, centerY, target.getComponent(0).getPreferredSize().width, target.getComponent(0).getPreferredSize().height);
    }
}
