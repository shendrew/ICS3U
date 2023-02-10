// A Shen, 08/01/2022
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton {

    // declare objects and variables
    static JLabel lblPrompt, lblFeedback;
    static JButton btnProcess;
    static JRadioButton jazz, rock, classical, blues;
    static JPanel panel;
    static ButtonGroup music;

    public static void guiApp()
    {
        // frame setup
        JFrame frame = new JFrame("JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create components
        panel = new JPanel(new GridLayout(7, 1, 5, 5));
        lblPrompt = new JLabel("Choose music type:");
        btnProcess = new JButton("Process Selection");
        lblFeedback = new JLabel("Output will show here");

        jazz = new JRadioButton("Jazz", false);
        rock = new JRadioButton("Rock", false);
        classical = new JRadioButton("Classical", false);
        blues = new JRadioButton("Blues", false);

        // logical relationship
        music = new ButtonGroup();
        music.add(jazz);
        music.add(rock);
        music.add(classical);
        music.add(blues);

        // add button event
        ButtonHandler onClick = new ButtonHandler();
        btnProcess.addActionListener(onClick);

        // add components to panel
        panel.add(lblPrompt);
        panel.add(jazz);
        panel.add(rock);
        panel.add(classical);
        panel.add(blues);
        panel.add(btnProcess);
        panel.add(lblFeedback);

        // add panel to frame
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

    // setup button event
    public static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // get data
            if (jazz.isSelected())
            {
                lblFeedback.setText("Jazz is my favourite!");
            }
            else
            {
                lblFeedback.setText("What? No Jazz?");
            }
        }
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                guiApp();
            }
        });
    }
}
