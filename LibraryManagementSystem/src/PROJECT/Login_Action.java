package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Login_Action {

    JFrame frame = new JFrame();
    JTextField textfield =new JTextField(15);
    JTextField TextField2 =new JPasswordField(15);

    Login_Action() {

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("LIBRARY MANAGEMENT SYSTEM");
        ImageIcon icon = new ImageIcon("Lib.jfif");
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);

        JLabel Label=new JLabel(" WELCOME TO THE LIBRARY " );
        frame.add(Label);
        Label.setFont(new Font("Verdana", Font.BOLD, 40));
        Label.setBounds(370,50,750,60);

        JLabel Label1=new JLabel("ADMIN LOGIN: ");
        frame.add(Label1);
        Label1.setFont(new Font("Verdana", Font.BOLD, 30));
        Label1.setBounds(660,240,760,60);

        JLabel Label2=new JLabel(" USERNAME ");
        frame.add(Label2);
        Label2.setFont(new Font("Verdana", Font.BOLD, 20));
        Label2.setBounds(610,350,150,60);

        JLabel Label3=new JLabel(" PASSWORD ");
        frame.add(Label3);
        Label3.setFont(new Font("Verdana", Font.BOLD, 20));
        Label3.setBounds(610,425,150,60);

        textfield.setBounds(770,360,250,45);
        textfield.addActionListener(this::loginAction);
        frame.add(textfield);

        TextField2.setBounds(770,430,250,45);
        TextField2.addActionListener(this::loginAction);
        frame.add(TextField2);

        JButton button=new JButton(" LOGIN ");
        button.setFont(new Font("Verdana", Font.PLAIN, 24));
        button.setBounds(730,530,200,40);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
        button.addActionListener(this::loginAction);
        frame.add(button);

        ImageIcon icon0= new ImageIcon("girls.jpg");
        JLabel label = new JLabel(icon0);
        label.setBounds(0, 0, 300,768 );
        frame.add(label);

        ImageIcon icon2 = new ImageIcon("FRAME.jpeg");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(300,0,766,780);
        frame.add(label2);

        ImageIcon icon1 = new ImageIcon("boys.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(1066, 0, 300,768 );
        frame.add(label1);

        frame.setVisible(true);
    }

    public void loginAction(ActionEvent e) {
        String username = textfield.getText();
        String password = TextField2.getText();

        if(username.equals("admin") && password.equals("admin123")) {
            frame.dispose();
            new GUI_Menu();
        }

        else {
            JOptionPane.showMessageDialog(frame,
                    "Please enter valid username and password",
                    "Alert",JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Login_Action();
    }
}
