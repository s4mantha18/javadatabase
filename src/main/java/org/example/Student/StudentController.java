package org.example.Student;

import java.sql.SQLException;

public class StudentController {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            StudentInfo student1 = new StudentInfo("Oliveth","MMS-Software engineering",19);
            StudentInfo student2 = new StudentInfo("Ken","Web Dev",17);
            StudentInfo student3 = new StudentInfo("Kate","Java",21);

       Jdbc jdbc = new Jdbc();
       jdbc.saveStudent(student1);
       jdbc.saveStudent(student2);
       jdbc.saveStudent(student3);
        }
    }


