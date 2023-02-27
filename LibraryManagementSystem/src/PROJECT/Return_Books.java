package PROJECT;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Return_Books{
    Return_Books(String bookName, String authorName, String rollNo) throws SQLException {

        Connection con = DBC.connection();
        Statement st=con.createStatement();

        ResultSet ids = st.executeQuery("SELECT * FROM issuedbooks;");

        boolean isPresent = false;
        boolean isRollNoValid = false;

        while (ids.next()) {
            if (ids.getString(1).equalsIgnoreCase(bookName)
                    && ids.getString(2).equalsIgnoreCase(authorName) ) {
                isPresent = true;
            }

            if(ids.getString(3).equalsIgnoreCase(rollNo)) {
                isRollNoValid=true;
            }
        }

        if(!isRollNoValid && isPresent) {
            JOptionPane.showMessageDialog(null,
                "Book is not issued on this Roll no",
                "Alert",JOptionPane.WARNING_MESSAGE);
        }

        else if (isPresent) {

            // delete book from issued table;
            st.executeUpdate("DELETE FROM issuedbooks WHERE BookName='" + bookName + "';");

            // add books in total books;
            st.executeUpdate("INSERT INTO totalbooks VALUES('"+bookName+"', '"+authorName+"');");

            JOptionPane.showMessageDialog(null, "Book is successfully returned");
        }

        else {
            JOptionPane.showMessageDialog(null,"This book is not issued");
        }
    }
}
//---------------------------------------------------------------------------------------------------------------------------

