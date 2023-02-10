// A Shen, 08/12/2021
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ModifyGreetings {

    static JLabel label;
    static JPanel panel;

    private static void guiApp()
    {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel("Text me!");
        JButton btnEnglish =new JButton("English");
        JButton btnFrench =new JButton("French");
        JButton btnSpanish =new JButton("Spanish");
        JButton btnRussian =new JButton("Russian");
        JButton btnHindi =new JButton("Hindi");

        ButtonHandler onClick = new ButtonHandler();
        btnEnglish.addActionListener(onClick);
        btnFrench.addActionListener(onClick);
        btnSpanish.addActionListener(onClick);
        btnRussian.addActionListener(onClick);
        btnHindi.addActionListener(onClick);

        panel.add(btnEnglish);
        panel.add(btnFrench);
        panel.add(btnSpanish);
        panel.add(btnRussian);
        panel.add(btnHindi);
        panel.add(label);

        frame.add(panel);
        frame.setSize(700, 100);
        frame.setVisible(true);
    }

    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            String selectBtn = e.getActionCommand();
            if (selectBtn.equals("English"))
            {
                label.setText("Hello");
            }
            else if (selectBtn.equals("French"))
            {
                label.setText("Bonjour");
            }
            else if (selectBtn.equals("Spanish"))
            {
                label.setText("Hola");
            }
            else if (selectBtn.equals("Russian"))
            {
                label.setText("Privet");
            }
            else if (selectBtn.equals("Hindi"))
            {
                label.setText("Namaste");
            }
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
