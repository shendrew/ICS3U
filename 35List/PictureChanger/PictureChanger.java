// A Shen, 08/01/2022
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PictureChanger
{
    // declare class level object and variables
    static JList picList;
    static JLabel lblPrompt, lblPicture;
    static JButton btnProcess;
    static DefaultListModel listModel;

    static ImageIcon defaultPic;
    static ImageIcon pic1;
    static ImageIcon pic2;
    static ImageIcon pic3;
    static ImageIcon pic4;
    static ImageIcon pic5;

    private static void guiApp()
    {
        // create and set up the window
        JFrame frame = new JFrame("JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.GREEN);
        
        // create ImageIcon with pictures
        defaultPic = new ImageIcon("default.jpg");
        pic1 = new ImageIcon("banana.jpeg");
        pic2 = new ImageIcon("coconut.png");
        pic3 = new ImageIcon("grape.jpeg");
        pic4 = new ImageIcon("lemon.jpeg");
        pic5 = new ImageIcon("apple.png");  
        
        // set up listModel for pictures
        listModel = new DefaultListModel();
        listModel.addElement("Banana");
        listModel.addElement("Coconut");
        listModel.addElement("Grapes");
        listModel.addElement("Lemon");
        listModel.addElement("Apple");
        
        // create the JList from the ListModel
        picList = new JList(listModel);
        picList.setVisibleRowCount(6);
        picList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // create prompt and image to display
        lblPrompt = new JLabel("Choose an image from the list");
        lblPicture = new JLabel(defaultPic);

        // set up JButton and output label
        btnProcess = new JButton("Process Selection");

        // create a new ButtonHandler instance
        ButtonHandler onClick = new ButtonHandler();
        btnProcess.addActionListener(onClick);

        // add components to the panel
        panel.add(lblPrompt);
        panel.add(picList);
        panel.add(btnProcess);
        panel.add(lblPicture);

        // add panel to frame and display the window
        frame.add(panel);
        frame.setSize(300, 450);
        frame.setVisible(true);
    }

    // create custom event handler
    private static class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // set selected picture
            String pic = (String) picList.getSelectedValue();

            if (pic.equals("Banana"))
                lblPicture.setIcon(pic1);

            if (pic.equals("Coconut"))
                lblPicture.setIcon(pic2);

            if (pic.equals("Grapes"))
                lblPicture.setIcon(pic3);

            if (pic.equals("Lemon"))
                lblPicture.setIcon(pic4);

            if (pic.equals("Apple"))
                lblPicture.setIcon(pic5);
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