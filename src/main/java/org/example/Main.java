package org.example;

import java.sql.*;
import java.util.Scanner;


public class Main {
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "rootpassword";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/controlsystemofschool";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Connection connection  = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        while(true){
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            int command = scanner.nextInt();

            if (command == 1){

                Statement statement = connection.createStatement();
                String SQL_SELECT = "select * from classes order by id";
                ResultSet result = statement.executeQuery(SQL_SELECT);


            }
            else{
                System.out.println("Команада не распознана ");
            }
        }







    }
}