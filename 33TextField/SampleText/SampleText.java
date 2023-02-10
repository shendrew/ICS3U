// A Shen, 08/01/2022
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SampleText {

    // declare objects and variables
    static JLabel labelPrompt, labelAnswer;
    static JTextField txtInput;
    static JButton btnProcess;
    static JPanel panel;

    public static void guiApp()
    {
        // frame setup
        JFrame frame = new JFrame("JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // create components
        panel = new JPanel(new GridLayout(4, 1, 5, 5));
        labelPrompt = new JLabel("Enter a number:");
        txtInput = new JTextField();
        btnProcess = new JButton("Process Number");
        labelAnswer = new JLabel();

        // add button event
        ButtonHandler onClick = new ButtonHandler();
        btnProcess.addActionListener(onClick);

        // add components to panel
        panel.add(labelPrompt);
        panel.add(txtInput);
        panel.add(btnProcess);
        panel.add(labelAnswer);

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
            String data=txtInput.getText();
            int num=Integer.parseInt(data);
            labelAnswer.setText(num+" doubled is: "+(2*num));
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
