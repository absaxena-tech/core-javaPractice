package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {

    private StudentService studentService = new StudentService(); // ✅ correct
    private Scanner scanner = new Scanner(System.in);

    // Menu method
    public void start() {
        while (true) { // ✅ loop menu
            System.out.println("\n---------------- Student Management System ----------------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentMarks();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting System...");
                    return;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }

    // Add Student
    private void addStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Name: ");
        String name = scanner.next();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        System.out.print("Is Available (true/false): ");
        boolean available = scanner.nextBoolean();

        Student student = new Student(rollNo, name, marks, available);
        studentService.addStudent(student);
    }

    // View All Students
    private void viewAllStudents() {
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Update Student Marks
    private void updateStudentMarks() {
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter New Marks: ");
        double marks = scanner.nextDouble();

        studentService.updateStudentMarks(rollNo, marks);
    }

    // Delete Student
    private void deleteStudent() {
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        studentService.deleteStudent(rollNo);
    }
}
