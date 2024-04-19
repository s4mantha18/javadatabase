package org.example.Student;

import java.sql.*;

public class Jdbc {
    public void getData() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "opuruiche");
        Statement obj = connect.createStatement();
    }
    public void saveStudent(StudentInfo student) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "opuruiche");
        PreparedStatement statement = connect.prepareStatement("insert into students(Name,Course,Age)"+ "values(?,?,?)");
        statement.setString(1,student.getName());
        statement.setString(2,student.getCourse());
        statement.setInt(3,student.getAge());

        statement.executeUpdate();
        PreparedStatement statement1 = connect.prepareStatement("Select * from students");
    }

    public static void main(String[] args) {

    }


    }


