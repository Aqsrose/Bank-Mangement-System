package bank.mangement.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn {

    Connection myCon;
    Statement statement;

    public Conn() throws ClassNotFoundException {
        String conUrl = "jdbc:sqlserver://localhost:1433;databaseName=BankManagementSystem;encrypt=true;trustServerCertificate=true;user=sa;password=1234";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//In java class name class and forName is function (for checking condition)
            myCon = DriverManager.getConnection(conUrl);//connection(interface)..driverManager is a class and getconnection(ststic method)
            statement = myCon.createStatement();//

//            String insertQuery = "INSERT INTO signUp (name,roll) VALUES('ALI', '20-ARID-503'), ('Aqsa', '20-ARID-463')";
//            statement.executeUpdate(insertQuery);
        } catch (SQLException ex) {
            System.out.println("Catch block running");
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
