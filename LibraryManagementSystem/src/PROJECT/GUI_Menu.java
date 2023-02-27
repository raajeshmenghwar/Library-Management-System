package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

class GUI_Menu {

    JFrame frame = new JFrame();

    GUI_Menu() {
        // frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Lib.jfif");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(1300, 780));
        frame.setTitle("LIBRARY MANAGEMENT SYSTEM");
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setText("ADMIN OPTIONS");
        label.setFont(new Font("Algerian", Font.BOLD, 40));
        label.setBounds(535, 40, 400, 50);
        frame.add(label);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 40, 40));
        panel.setBounds(225, 130, 900, 240);

        // Buttons that display on Admin Options Page.
        JButton Available_Books = new JButton();
        JButton View_Members = new JButton();
        JButton View_User_Issued_Books = new JButton();
        JButton Issue_Books_To_Submit = new JButton();
        JButton Return_Books_From_Student = new JButton();
        JButton Logout = new JButton();

        Available_Books.setText("AVAILABLE BOOKS");
        Available_Books.setFont(new Font("Arial", Font.BOLD, 14));
        Available_Books.setBackground(Color.BLACK);
        Available_Books.setForeground(Color.WHITE);
        Available_Books.setFocusable(false);

        View_Members.setText("LIBRARY MEMBERS");
        View_Members.setFont(new Font("Arial", Font.BOLD, 14));
        View_Members.setBackground(Color.BLACK);
        View_Members.setForeground(Color.WHITE);
        View_Members.setFocusable(false);

        View_User_Issued_Books.setText("VIEW ISSUED BOOKS");
        View_User_Issued_Books.setFont(new Font("Arial", Font.BOLD, 14));
        View_User_Issued_Books.setBackground(Color.BLACK);
        View_User_Issued_Books.setForeground(Color.WHITE);
        View_User_Issued_Books.setFocusable(false);

        Issue_Books_To_Submit.setText("ISSUE BOOK TO STUDENT");
        Issue_Books_To_Submit.setFont(new Font("Arial", Font.BOLD, 14));
        Issue_Books_To_Submit.setBackground(Color.BLACK);
        Issue_Books_To_Submit.setForeground(Color.WHITE);
        Issue_Books_To_Submit.setFocusable(false);

        Return_Books_From_Student.setText("RETURN BOOK FROM STUDENT");
        Return_Books_From_Student.setFont(new Font("Arial", Font.BOLD, 14));
        Return_Books_From_Student.setBackground(Color.BLACK);
        Return_Books_From_Student.setForeground(Color.WHITE);
        Return_Books_From_Student.setFocusable(false);

        Logout.setText("LOGOUT");
        Logout.setFont(new Font("Arial", Font.BOLD, 14));
        Logout.setBackground(Color.BLACK);
        Logout.setForeground(Color.WHITE);
        Logout.setFocusable(false);

        JPanel Picture = new JPanel();
        ImageIcon Background_Image = new ImageIcon("yellow.jpeg");
        JLabel Label = new JLabel(Background_Image);
        Picture.setBounds(0, -10, 1380, 740);
        Picture.add(Label);

        // Added those Buttons on panel

        panel.add(Available_Books);
        panel.add(View_Members);
        panel.add(View_User_Issued_Books);
        panel.add(Issue_Books_To_Submit);
        panel.add(Return_Books_From_Student);
        panel.add(Logout);
        frame.add(panel);
        frame.add(Picture);
        panel.setOpaque(false);

        // Applied Functionalities on buttons.

        Available_Books.addActionListener(e -> {
            try {
                new Available_Books();
            }
            catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        View_Members.addActionListener(e -> {
            new View_Members();
        });

        View_User_Issued_Books.addActionListener(e -> {
            try {
                new View_Issued_Books();
            }
            catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        Issue_Books_To_Submit.addActionListener(e -> {
            frame.dispose();
            new GUI_Issue_Books();
        });

        Return_Books_From_Student.addActionListener(e -> {
            frame.dispose();
            new GUI_ReturnBooks();
        });

        Logout.addActionListener(e -> {
            frame.dispose();
            new Login_Action();
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Menu();
    }
}


