import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AWTChoiceExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Choice Example");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Create a Choice component
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Add the Choice component to the frame
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
