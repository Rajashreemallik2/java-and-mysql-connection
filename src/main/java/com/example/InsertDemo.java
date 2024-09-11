package com.example;

import java.sql.*;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args) throws Exception {

        // --------------User Values --------------

//        Scanner sc = new Scanner(System.in);
//        String name1 = sc.next();
//        String email1 = sc.next();
//        String psw1 = sc.next();
//        String gender1 = sc.next();
//        String city1 = sc.next();
        String name1 ="Duke";
        String email1 ="duke@gmail.com";
        String psw1 = "duke@234";
        String gender1 = "Male";
        String city1 ="Bangalore";

        String url = "jdbc:mysql://localhost:3306/employeeDb";// Replace "employeeDb" with your database
        String username ="root"; //Replace with your username
        String password ="Raj@1996"; //Replace with your password

        Connection connection = null;

        // 1. Establish the connection using DriverManager
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to the database!");

        // 2. Create a statement
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO employee VALUES(?,?,?,?,?)"); // Positional Parameters
        ps.setString(1,name1);
        ps.setString(2, email1);
        ps.setString(3, psw1);
        ps.setString(4, gender1);
        ps.setString(5, city1);
        int i = ps.executeUpdate();
        if (i > 0){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

//        // 3. Execute a query
//        String sql = "SELECT * FROM employee";//Replace with SQL Query
//        ResultSet resultSet = ps.executeQuery(sql);
//
//        // 4. Process the result set
//        while (resultSet.next()){
//            System.out.println("Employee Id: " + resultSet.getInt("id"));
//            System.out.println("Employee Name: " + resultSet.getNString("Name"));
//        }
//        // 5. Close connection
//
//        if (connection != null){
//            connection.close();
//            System.out.println("Connection closed.");
//        }
    }
}