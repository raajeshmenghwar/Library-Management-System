package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class GUI_ReturnBooks {

    JFrame frame = new JFrame();

    ImageIcon icon = new ImageIcon("Lib.jfif");
    ImageIcon icon1 = new ImageIcon("BAR1.jpg");
    ImageIcon icon2 = new ImageIcon("BAR1.jpg");

    GUI_ReturnBooks() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(1300, 780));
        frame.setTitle("RETURN BOOKS");
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setBounds(400, 0,580 , 780);
        panel.setLayout(null);
        Color color = new Color(249, 245, 136);
        panel.setBackground(color);
        JLabel RollNo = new JLabel("Enter RollNO: ");
        RollNo.setBounds(50, 230, 250, 30);
        RollNo.setFont(new Font("Arial",Font.BOLD, 18));

        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0, 0, 400,740 );
        frame.add(label1);

        JLabel Instruction = new JLabel("WELCOME TO RETURN BOOK OPTION. ");
        Instruction.setBounds(10,80 , 580, 40);
        Instruction.setFont(new Font("Arial",Font.BOLD, 30));
        panel.add(Instruction);

        JLabel Instruction1 = new JLabel("You can now return book by given below information.");
        Instruction1.setBounds(20,160 , 580, 30);
        Instruction1.setFont(new Font("Arial",Font.BOLD, 18));
        panel.add(Instruction1);

        JLabel label2 = new JLabel(icon2);
        label2.setBounds(980, 0, 400,740 );
        frame.add(label2);

        JLabel BookName = new JLabel("Enter BookName:  ");
        BookName.setBounds(50, 280, 250, 30);
        BookName.setFont(new Font("Arial",Font.BOLD, 18));

        JLabel BookAuthor= new JLabel("Enter Book Author Name: ");
        BookAuthor.setBounds(50, 330, 320, 30);
        BookAuthor.setFont(new Font("Arial",Font.BOLD, 18));

        JTextField Rollno = new JTextField();
        Rollno.setBounds(320, 230, 200, 30);

        JTextField Bookname  = new JTextField();
        Bookname.setBounds(320, 280, 200, 30);

        JTextField Bookauthor = new JTextField();
        Bookauthor.setBounds(320, 330, 200, 30);

        JButton Return = new JButton("RETURN");
        Return.setBounds(300,480,220,40);
        Return.setFont(new Font("Arial",Font.BOLD, 18));
        Return.setBackground(Color.BLACK);
        Return.setForeground(Color.WHITE);

        Return.addActionListener(e -> {
            try {
                new Return_Books(Bookname.getText(), Bookauthor.getText(), Rollno.getText());
            }

            catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton backButton = new JButton("BACK TO MENU");
        backButton.setBounds(50, 480, 220, 40);
        backButton.setFont(new Font("Arial",Font.BOLD, 18));
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);

        backButton.addActionListener(e -> {
            frame.dispose();
            new GUI_Menu();
        });

        frame.add(panel);
        panel.add(RollNo);
        panel.add(BookName);
        panel.add(BookAuthor);
        panel.add(Rollno);
        panel.add(Bookname);
        panel.add(Bookauthor);
        panel.add(Return);
        panel.add(backButton);
        frame.setVisible(true);
    }
}


