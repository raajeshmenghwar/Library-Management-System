package PROJECT;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Available_Books{
    Available_Books() throws SQLException {

        JDialog frame=new JDialog();
        ImageIcon icon = new ImageIcon("Lib.jfif");
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setTitle("AVAILABLE BOOKS");
        frame.setIconImage(icon.getImage());

        Connection con = DBC.connection();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM totalbooks ORDER BY BOOKNAME ASC");

        ArrayList<String> bookName=new ArrayList<>();
        ArrayList<String> bookAuthor=new ArrayList<>();

        while (rs.next()){
            bookName.add(rs.getString("BookName"));
            bookAuthor.add(rs.getString("BookAuthor"));
        }

        int size=bookName.size();
        String[][] data=new String[size][2];

        for(int i=0; i<size; i++) {
            data[i][0]=bookName.get(i);
            data[i][1]=bookAuthor.get(i);
        }

        String[] heading={"Book Name", "Book Author"};
        JTable table = new JTable(data, heading);
        JScrollPane js = new JScrollPane(table);
        frame.add(js);
        frame.setVisible(true);
    }
}