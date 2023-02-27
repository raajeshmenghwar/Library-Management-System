package PROJECT;

import javax.swing.*;
import java.sql.*;

class Issue_Books{

    String[] members={"K21SW001", "K21SW003", "K21SW004", "K21SW007", "K21SW008", "K21SW009",
            "K21SW010", "K21SW011", "K21SW012", "K21SW013", "K21SW014", "K21SW015", "K21SW016",
            "K21SW017", "K21SW018", "K21SW019", "K21SW021", "K21SW023", "K21SW025", "K21SW027",
            "K21SW028", "K21SW029", "K21SW030", "K21SW031", "K21SW032", "K21SW033", "K21SW035",
            "K21SW036", "K21SW038", "K21SW042", "K21SW043", "K21SW044", "K21SW045", "K21SW047",
            "K2021SW050", "K2021SW053"};

    Issue_Books(String RollNo, String bookName, String authorName) throws SQLException {

        Connection con = DBC.connection();
        Statement statement = con.createStatement();
        PreparedStatement statement1 = con.prepareStatement
                ("INSERT INTO issuedbooks (BookName,BookAuthor,RollNo) VALUES(?,?,?);");

        ResultSet ids = statement.executeQuery("SELECT * FROM totalbooks;");

        boolean isPresent = false;
        while (ids.next()) {
            if (ids.getString(1).equalsIgnoreCase(bookName)
                    && ids.getString(2).equalsIgnoreCase(authorName)) {
                isPresent = true;
                break;
            }
        }

        boolean isRollNoValid=false;
        for(String i: members) {
            if(i.equalsIgnoreCase(RollNo)) {
                isRollNoValid=true;
                break;
            }
        }

        if(!isRollNoValid) {
            JOptionPane.showMessageDialog(null,
                "You are not a member",
                "Alert",JOptionPane.WARNING_MESSAGE);
        }

        if (isPresent) {

            // Delete data from total_books;
            statement.executeUpdate("DELETE FROM totalbooks WHERE BookName= '" + bookName + "';");

            // inserting data in issue book table;
            statement1.setString(1, bookName);
            statement1.setString(2, authorName);
            statement1.setString(3, RollNo);
            statement1.executeUpdate();

            JOptionPane.showMessageDialog(null, "Book is successfully Issued");
        }

        else {
            JOptionPane.showMessageDialog(null, "Recheck BookName and BookAuthor");
        }
    }
}