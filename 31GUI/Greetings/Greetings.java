// A Shen, 08/12/2021
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Greetings {

    static JLabel label;
    static JPanel panel;

    private static void guiApp()
    {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel("Text me!");
        JButton btnClick =new JButton("Send text!");

        ButtonHandler onClick = new ButtonHandler();
        btnClick.addActionListener(onClick);

        panel.add(btnClick);
        panel.add(label);

        frame.add(panel);
        frame.setSize(250, 100);
        frame.setVisible(true);
    }

    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            label.setText("Hello world!");
        }
    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater (new Runnable()
        {
            public void run()
            {
                guiApp();
            }
        });
    }
}
