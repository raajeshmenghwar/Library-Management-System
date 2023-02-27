package PROJECT;

import javax.swing.*;
import java.awt.*;

class View_Members {

    JDialog frame=new JDialog();

    View_Members() {

        ImageIcon icon = new ImageIcon("Lib.jfif");

        frame.setTitle("LIBRARY MANAGEMENT SYSTEM");
        frame.setIconImage(icon.getImage());

        String[][] data = {
                {"Hasnain","K-21SW001", "hey@hasnain.social" },
                {"Amir Ali", "K-21SW003", "amiralichohan786@gmail.com"},
                {"Muhammad Munawar", "K-21SW004", "muhammadmunawar2004@gmail.com" },
                {"Inzamam-ul-Haq", "K-21SW007", "inzmamjani786110@gmail.com" },
                {"Awais Raza", "K-21SW008", "awaisraza@gmail.com" },
                {"Rajesh Kumar", "K-21SW009", "rajeshkumar@gmail.com" },
                {"Usman Mughal", "K-21SW010", "mughalusman2299@gmail.com" },
                {"Alee Raza", "K-21SW011", "alees.8655@gmail.com" },
                {"Zarar Ahmed", "K-21SW012", "zararali@gmail.com" },
                {"Adnan Qureshi", "K-21SW013", "adnankhanab948@gmail.com" },
                {"Muhammad Mudasir", "K-21SW014", "mudasirkhan@gmail.com" },
                {"Sadaf Iqbal", "K-21SW015", "sadafiqbal@gmail.com" },
                {"Gul Zaman", "K-21SW016", "gulzaman@gmail.com" },
                {"Nadia","K-21SW017","nadiarajpoot44@gmail.com" },
                {"Jamshed","K-21SW018","solangijamshedali2003@gmail.com" },
                {"Abdus Samad","K-21SW019","kandhro62@gmail.com" },
                {"Safiullah","K-21SW021","shahzaibth3gr8@gmail.com" },
                {"Sanjay Kumar","K-21SW023","sanjaykumar@gmail.com" },
                {"Asad Ali Arain","K-21SW025","arainBbb@gmail.com" },
                {"Junaid","K-21SW027","junaidmemon@gmail.com" },
                {"Muskan Ali Rizvi","K-21SW028","muskanalirizvi1@gmail.com" },
                {"Shakeel Ahmed","K-21SW029","shakeelkhuhro73@gmail.com" },
                {"Rehan Mehdi","K-21SW030","rehanmehdichandio@gmail.com" },
                {"Areeba","K-21SW031","mareeba166@gmail.com" },
                {"Ahsan Ali","K-21SW032","Ahsanali04783@gmail.com" },
                {"Haris Baloch","K-21SW033","harisbaloch@gmail.com" },
                {"Muhammad Qasim","K-21SW035","qasimsoomro@gmail.com" },
                {"Asad Panhwar","K-21SW036","asadalipuh5@gmail.com" },
                {"Muskan Saleh","K-21SW038","muskaankorejo66@gmail.com" },
                {"Muhammad Waleed","K-21SW042","mw051878@gmail.com" },
                {"Muhammad Talha","K-21SW043","talhaqurashi@gmail.com" },
                {"Uzair Memon","K-21SW044","ahmeduzair53@gmail.com" },
                {"Muzammil ","K-21SW045","muzammilali@gmail.com" },
                {"Vijay Kumar ","K-21SW047","vijaykumarmalhi877@gmail.com" },
                {"Ehsaan ","K-2021SW050","sabzoiihsanahmed@gmail.com" },
                {"Ayaan ","K-2021SW053","ayaanali@gmail.com" },
        };

        String[] column = { "Name","Roll No", "Email" };
        JTable table = new JTable(data, column);

        JScrollPane js = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1380, 740);

        panel.add(js);
        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new View_Members();
    }
}

