package mysql.working.with.java;

import java.sql.*;

public class DatabaseConnection {
    private Connection connect = null;
    private PreparedStatement pstatement = null;
    // get connect with mySQL server
    public void getConnect() {
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptech_fpt?useUnicode=true&characterEncoding=utf8", "root", "");
        } catch (Exception e) {
            System.err.println("Error when try connect to database");
        }
    }

    // close connect with mySQL server
    public void closeConnect() {
        try {
            this.connect.close();
        } catch (Exception e) {
            System.err.println("Error when try to close connect");
        }
    }

    //create the prepare statement with a query (insert into, delete,...)
    public void createPrepareStatement(String statementQuery) {
        try {
            this.pstatement = connect.prepareStatement(statementQuery);
        } catch (Exception e) {
            System.err.println("Error when create prepare statement");
        }
    }

    // set string for prepare statement
    public void pstmtSetString(int index,String param) {
        try {
            this.pstatement.setString(index, param);
        } catch (Exception e) {
            System.err.println("Error when set string to prepare statement");
        }
    }

    //set long for prepare statement
    public void pstmtSetLong(int index, long param) {
        try {
            this.pstatement.setLong(index, param);
        } catch (Exception e) {
            System.err.println("Error when set integer to prepare statement");
        }
    }

    //set int for prepare statement
    public void pstmtSetInt(int index, int param) {
        try {
            this.pstatement.setInt(index, param);
        } catch (Exception e) {
            System.err.println("Error when set integer to prepare statement");
        }
    }

    // exec the prepare statement
    public void execPrepareStatement() {
        try {
            this.pstatement.executeUpdate();
            System.out.println("==========================");
            System.out.println("Execute Success!");
            System.out.println(this.pstatement.toString());
            System.out.println("==========================");
        } catch (Exception e) {
            System.err.println("Error when execute prepare statement");
        }
    }
}
