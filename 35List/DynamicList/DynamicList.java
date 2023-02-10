// A Shen, 08/01/2022
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DynamicList
{
    // declare class level object and variables
    static JList cityList;
    static JLabel lblOutput, lblPrompt;
    static JTextField txtInput;
    static JButton btnProcess;
    static DefaultListModel listModel;

    private static void guiApp()
    {
        // create and set up the window
        JFrame frame = new JFrame("JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        lblPrompt = new JLabel("Enter a City to Add:");
        txtInput = new JTextField();

        // set up listModel for list elements
        listModel = new DefaultListModel();
        listModel.addElement("Ottawa");
        listModel.addElement("Barrie");
        listModel.addElement("Sudbury");
        listModel.addElement("Toronto");
        listModel.addElement("London");
        listModel.addElement("Windsor");
        listModel.addElement("Thunder Bay");

        // create the JList from the ListModel
        cityList = new JList(listModel);
        cityList.setVisibleRowCount(5);
        cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // set up a scroll pane for hte JList
        JScrollPane listScroll = new JScrollPane(cityList);

        // set up JButton and output label
        btnProcess = new JButton("Add City to List");

        // create a new ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler();
        btnProcess.addActionListener(onClick);

        // add components to the panel
        panel.add(lblPrompt);
        panel.add(txtInput);
        panel.add(btnProcess);
        panel.add(listScroll);

        // add panel to frame and display the window
        frame.add(panel);
        frame.setSize(200, 180);
        frame.setVisible(true);
    }

    // create custom event handler
    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            listModel.addElement(txtInput.getText());
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