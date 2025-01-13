package org.example;
import java.util.ArrayList;
import java.util.List;

public class StudentList implements StudentManagement {
    private final List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    // Implementing manageStudents method
    @Override
    public void manageStudents() {
        System.out.println("Managing students...");
        // Add functionality like adding, removing students, etc.
    }

    // Method to add student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students
    public void displayStudents() {
        students.forEach(System.out::println);
    }

    // Other methods can be added (e.g., removeStudent, findStudentById, etc.)
}
