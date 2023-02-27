package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI_Frame{

    GUI_Frame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(1300, 780));
        frame.setTitle("LIBRARY MANAGEMENT SYSTEM");
        ImageIcon Favicon = new ImageIcon("Lib.jfif");
        frame.setIconImage(Favicon.getImage());
        frame.setLayout(null);


        JLabel Label0=new JLabel(" TODAY A READER   TOMORROW A LEADER " );
        frame.add(Label0);
        Label0.setFont(new Font("Verdana", Font.BOLD, 50));
        Label0.setBounds(50,20,1280,60);
        Label0.setForeground(Color.BLACK);

        JButton button=new JButton(" LOGIN AS ADMIN ");
        button.setBounds(540,150,300,60);
        frame.add(button);
        button.setBackground(Color.BLACK);
        button.setFont(new Font("Verdana", Font.PLAIN, 20 ));
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Login_Action();
            }
        });

        ImageIcon Background_Image= new ImageIcon("Central.jpg");
        JLabel label = new JLabel(Background_Image);
        label.setBounds(0, 0, 1380,780 );
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new GUI_Frame();
    }
}





