// A Shen, 08/12/2021
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ModifyGreetingsGrid {

    // declare objects
    static JLabel labelEnglish, labelFrench, labelSpanish, labelRussian, labelHindi;
    static JPanel panel;

    private static void guiApp()
    {
        // frame setup
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create components
        panel = new JPanel(new GridLayout(5, 2, 5, 5));
        panel.setBackground(Color.YELLOW);
        labelEnglish = new JLabel("Text me!");
        labelFrench = new JLabel("Text me!");
        labelSpanish = new JLabel("Text me!");
        labelRussian = new JLabel("Text me!");
        labelHindi = new JLabel("Text me!");
        JButton btnEnglish =new JButton("English");
        JButton btnFrench =new JButton("French");
        JButton btnSpanish =new JButton("Spanish");
        JButton btnRussian =new JButton("Russian");
        JButton btnHindi =new JButton("Hindi");

        // add button event
        ButtonHandler onClick = new ButtonHandler();
        btnEnglish.addActionListener(onClick);
        btnFrench.addActionListener(onClick);
        btnSpanish.addActionListener(onClick);
        btnRussian.addActionListener(onClick);
        btnHindi.addActionListener(onClick);
        
        // add components to panel
        panel.add(btnEnglish);
        panel.add(labelEnglish);
        panel.add(btnFrench);
        panel.add(labelFrench);
        panel.add(btnSpanish);
        panel.add(labelSpanish);
        panel.add(btnRussian);
        panel.add(labelRussian);
        panel.add(btnHindi);
        panel.add(labelHindi);

        // add panel to frame
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setVisible(true);
    }

    // setup button event
    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            String selectBtn = e.getActionCommand();
            if (selectBtn.equals("English"))
            {
                labelEnglish.setText("Hello");
            }
            else if (selectBtn.equals("French"))
            {
                labelFrench.setText("Bonjour");
            }
            else if (selectBtn.equals("Spanish"))
            {
                labelSpanish.setText("Hola");
            }
            else if (selectBtn.equals("Russian"))
            {
                labelRussian.setText("Privet");
            }
            else if (selectBtn.equals("Hindi"))
            {
                labelHindi.setText("Namaste");
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
