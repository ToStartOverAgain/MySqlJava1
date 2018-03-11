/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;

/**
 *
 * @author Admin
 */
public class StringHand {
     public static void main(String[] args) {
        // SQL select.
        String sqlSelect = "SELECT * FROM Students;";

        // SQL insert.
        String rollNumber = "A0123";
        String name = "Xuan Hung";
        String email = "xuanhung@gmail.com";
        String phone = "0123456";
        // INSERT INTO Students (rollNumber, name, email, phone) VALUE ('A123', 'Hung', 'xuanhung@gmail.com', '0912');
        String sqlInsert = "INSERT INTO Students (rollNumber, name, email, phone) VALUE ('" + rollNumber + "', '" + name + "', '" + email + "', '" + phone + "');";
        System.out.println(sqlInsert);

        // SQL update.
        int id = 10;
        String rollNumberUpdate = "A0123";
        String nameUpdate = "Xuan Hung";
        String emailUpdate = "xuanhung@gmail.com";
        String phoneUpdate = "0123456";
        // UPDATE Students SET rollNumber='A321', name='Dao Hung', email='xuanhung@gmail.com', phone='01234' WHERE id = 10;
        String sqlUpdate = "UPDATE Students SET rollNumber='" + rollNumber + "', name='" + name + "', email='" + email + "', phone='" + phone + "' WHERE id=" + id + ";";
        System.out.println(sqlUpdate);
        
        // SQL delete.
        int idDelete = 10;
        // DELETE FROM Students WHERE id = 10;
        String sqlDelete = "DELETE FROM Students WHERE id=" + id;
        System.out.println(sqlDelete);
    }
    
}
