// A Shen, 09/12/2021
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contacts {

    static JLabel labelName, labelCell, labelHome, labelEmail;
    static JPanel panel;

    private static void guiApp()
    {
        JFrame frame = new JFrame("Contacts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(2, 4, 3, 3));

        labelName = new JLabel("");
        labelCell = new JLabel("");
        labelHome = new JLabel("");
        labelEmail = new JLabel("");

        JButton btnName = new JButton("Name");
        JButton btnCell = new JButton("Cell");
        JButton btnHome = new JButton("Home");
        JButton btnEmail = new JButton("Email");

        ButtonHandler onClick = new ButtonHandler();
        btnName.addActionListener(onClick);
        btnCell.addActionListener(onClick);
        btnHome.addActionListener(onClick);
        btnEmail.addActionListener(onClick);

        panel.add(btnName);
        panel.add(labelName);
        panel.add(btnCell);
        panel.add(labelCell);
        panel.add(btnHome);
        panel.add(labelHome);
        panel.add(btnEmail);
        panel.add(labelEmail);

        frame.add(panel);
        frame.setSize(700, 100);
        frame.setVisible(true);
    }

    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String selectBtn = e.getActionCommand();
            if (selectBtn.equals("Name"))
            {
                labelName.setText("Andrew S");
            }
            else if (selectBtn.equals("Cell"))
            {
                labelCell.setText("519-555-1234");
            }
            else if (selectBtn.equals("Home"))
            {
                labelHome.setText("519-555-9999");
            }
            else if (selectBtn.equals("Email"))
            {
                labelEmail.setText("shenandr535@gotvdsb.ca");
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
