// A Shen, 08/01/2022
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuessNumber {

    // declare class level objects and variables
    static JButton btnCheck;
    static JLabel lblTitle, lblInstruct, lblFeedback;
    static JTextField txtInput;
    static int targetNum;
    static int counter=0;

    public static void guiApp()
    {
        // create and set up the window
        JFrame frame = new JFrame("Guess A Number Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create components;
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.setBackground(Color.WHITE);
        Font titleFont = new Font("TimesRoman", Font.BOLD, 24);
        Font otherFont = new Font("TimesRoman", Font.BOLD, 18);

        lblTitle = new JLabel("Guess My Number", JLabel.CENTER);
        lblTitle.setFont(titleFont);
        lblInstruct = new JLabel("Between 1 and 100", JLabel.CENTER);
        lblInstruct.setFont(otherFont);
        txtInput = new JTextField();
        txtInput.setHorizontalAlignment(JTextField.CENTER);
        btnCheck = new JButton("Check Guess");
        lblFeedback = new JLabel("", JLabel.CENTER);

        // create a ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler();
        btnCheck.addActionListener(onClick);

        // get number to guess
        targetNum = (int)(Math.random()*100+1);

        // add components to content panel
        panel.add(lblTitle);
        panel.add(lblInstruct);
        panel.add(txtInput);
        panel.add(btnCheck);
        panel.add(lblFeedback);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    // setup button event
    public static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // set button text
            btnCheck.setText("Check Guess");

            // read in text
            String data = txtInput.getText();
            int guess = Integer.parseInt(data);
            counter++;
            
            // check guess against target
            if (guess > targetNum)
            {
                lblFeedback.setText("Too High");
            }
            else if (guess < targetNum)
            {
                lblFeedback.setText("Too Low");
            }
            else
            {
                // display feedback and prepare to play again
                lblFeedback.setText("You guess it in " + counter + " guesses!");
                btnCheck.setText("Play Again?");
                counter=0;
                targetNum = (int)(Math.random()*100+1);
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
