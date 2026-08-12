package com.StartSpring.repository;

import com.StartSpring.model.Student;

import java.sql.*;

public class StudentRepo {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String username = "postgres";
    String password = "Atharva153122";

    public void createUser (){
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO students_info (name, email, age) " +
                    "VALUES ('Amrut', 'ad@gmail.com', 23)";
            int result = statement.executeUpdate(sql);
            if (result==1){
                System.out.println("Data inserted ");
            }
            else {
                System.out.println("bot inserted");
            }
            connection.close();
        }
        catch (SQLException e) {
            System.out.println("Database Connection failed :( ");
            e.printStackTrace();
        }
    }




//    public void updateuser () {
//        try {
//            Connection connection = DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//            String sql = "UPDATE students_info " +
//                    "SET name='Ajilnskya', email='aa@gmail.com', age=23 " +
//                    "WHERE id=1";
//            int result = statement.executeUpdate(sql);
//            if (result==1){
//                System.out.println("Data updated ");
//            }
//            else {
//                System.out.println("data not updated");
//            }
//            connection.close();
//        }
//        catch (SQLException e) {
//            System.out.println("Database Connection failed :( ");
//            e.printStackTrace();
//        }
//    }


//    public  void deleteUser () {
//        try {
//            Connection connection = DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//            String sql = "DELETE  from students_info " +
//                    "WHERE id=1";
//            int result = statement.executeUpdate(sql);
//            if (result==1){
//                System.out.println("Data deleted ");
//            }
//            else {
//                System.out.println("data not deleted");
//            }
//            connection.close();
//        }
//        catch (SQLException e) {
//            System.out.println("Database Connection failed :( ");
//            e.printStackTrace();
//        }
//    }


//    public void getUserById () {
//        try {
//            Connection connection = DriverManager.getConnection(url,username,password);
//            Statement statement = connection.createStatement();
//            String sql = "SELECT id, name, email, age" +
//                    " FROM students_info where id = 2";
//
//            ResultSet resultSet = statement.executeQuery(sql);
//            Student student = mapRow (resultSet);
//            System.out.println(student);
//
//
//            connection.close();
//        }
//        catch (SQLException e) {
//            System.out.println("Database Connection failed :( ");
//            e.printStackTrace();
//        }
//    }
//
//    private Student mapRow(ResultSet resultSet) throws SQLException {
//        Student student= new Student();
//
//        student.setId(resultSet.getLong("id"));
//        student.setName(resultSet.getString("name"));
//        student.setEmail(resultSet.getString("email"));
//        student.setAge(resultSet.getInt("age"));
//
//        return student;
//    }
}
