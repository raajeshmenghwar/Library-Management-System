package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class View_Issued_Books{
    View_Issued_Books() throws SQLException {
        JDialog frame=new JDialog();
        ImageIcon icon = new ImageIcon("Lib.jfif");
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setTitle("LIBRARY MANAGEMENT SYSTEM");
        frame.setIconImage(icon.getImage());
        Connection con = DBC.connection();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(DBC.ViewIssuedBooks + " ORDER BY BookAuthor ASC");
        ArrayList<String> bookName=new ArrayList<>();
        ArrayList<String> bookAuthor=new ArrayList<>();
        ArrayList<String> rollNo=new ArrayList<>();
        while (rs.next()) {// this loop will execute till to tend
            bookName.add(rs.getString("BookName"));
            bookAuthor.add(rs.getString("BookAuthor"));
            rollNo.add(rs.getString(3));
        }
        int size=bookName.size();
        String[][] data=new String[size][3];

        for(int i=0; i<size; i++) {
            data[i][0]=rollNo.get(i);
            data[i][1]=bookName.get(i);
            data[i][2]=bookAuthor.get(i);
        }

        String[] heading={"Roll No", "Book Name", "Book Author"};
        JTable table = new JTable(data, heading);
        JScrollPane js = new JScrollPane(table);
        frame.add(js);
        frame.setVisible(true);
        new Menu();
    }

}

