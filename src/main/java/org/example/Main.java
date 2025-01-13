package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John Doe", 20);
        Student student2 = new Student(2, "Jane Doe", 22);

        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.addStudent(student2);

        studentList.displayStudents(); // Test the method to display students
    }
}
