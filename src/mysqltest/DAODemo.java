/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DAODemo {
    public static void main(String[] args) {
        DAODemo daodemo = new DAODemo();
        daodemo.selectFrom();
    }
    
    public void selectFrom (){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptech_fpt", "root", "");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM students");
            while(rs.next()){
                int id = rs.getInt("id");
                String rollNumber = rs.getString("rollNumber");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String status = rs.getString("status");
                System.out.println(id + " - " + rollNumber + " - " + name + " - " + phone + " - " + email);
            }
            
        } catch (SQLException e) {
            System.out.println("error");
        }finally {
            try {
                
                
                
              con.close();
            } catch (SQLException e) {
                System.err.println("Error");
            }
        }
    }
    
}
