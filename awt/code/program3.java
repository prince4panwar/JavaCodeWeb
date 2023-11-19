
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

 class ButtonLayout 
 {
    public static void main(String[] args) 
    {
        Frame f = new Frame("Button Layouts");
        Button northButton = new Button("North");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button southButton = new Button("South");
        Button centerButton = new Button("Center");
        f.setLayout(new BorderLayout());
        f.add(northButton, BorderLayout.NORTH);
        f.add(eastButton, BorderLayout.EAST);
        f.add(westButton, BorderLayout.WEST);
        f.add(southButton, BorderLayout.SOUTH);
        f.add(centerButton, BorderLayout.CENTER);
        northButton.setBackground(Color.RED);
        eastButton.setBackground(Color.GREEN);
        westButton.setBackground(Color.PINK);
        southButton.setBackground(Color.GRAY);

        northButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("North Button Clicked");
            }
        });

        eastButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("East Button Clicked");
            }
        });

        westButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("West Button Clicked");
            }
        });

        southButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("South Button Clicked");
            }
        });

        centerButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("Center Button Clicked");
            }
        });

        f.setSize(400, 300);
        f.setVisible(true);
}
}
