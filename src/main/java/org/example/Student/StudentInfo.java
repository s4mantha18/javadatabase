package org.example.Student;

public class StudentInfo {
    private String Name;
    private String Course;
    private int Age;

    public StudentInfo(String Name, String Course, int Age) {
        this.Name = Name;
        this.Course = Course;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public String getCourse() {
        return Course;
    }

    public int getAge() {
        return Age;
    }
}
