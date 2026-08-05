package com.StartSpring.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepo {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String username = "postgres";
    String password = "Atharva153122";

//    public void createUser (){
//        try {
//            Connection connection = DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//            String sql = "INSERT INTO students_info (name, email, age) " +
//                    "VALUES ('Amrut', 'a@gmail.com', 23)";
//            int result = statement.executeUpdate(sql);
//            if (result==1){
//                System.out.println("Data inserted ");
//            }
//            else {
//                System.out.println("bot inserted");
//            }
//            connection.close();
//        }
//        catch (SQLException e) {
//            System.out.println("Database Connection failed :( ");
//            e.printStackTrace();
//        }
//    }



    public void updateuser () {
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String sql = "UPDATE students_info " +
                    "SET name='Ajinkya', email='a@gmail.com', age=23 " +
                    "WHERE id=1";
            int result = statement.executeUpdate(sql);
            if (result==1){
                System.out.println("Data updated ");
            }
            else {
                System.out.println("data not updated");
            }
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("Database Connection failed :( ");
            e.printStackTrace();
        }
    }
}
