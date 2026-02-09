package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    // This list acts like a database
    private List<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(" Student added successfully!");
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return students;
    }

    //  Get Student by Roll No
    public Student getStudentByRollNo(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null; // not found
    }

    // Update Student Marks
    public boolean updateStudentMarks(int rollNo, double newMarks) {
        Student student = getStudentByRollNo(rollNo);
        if (student != null) {
            student.setMarks(newMarks);
            System.out.println(" Student marks updated!");
            return true;
        }
        System.out.println("Student not found!");
        return false;
    }

    //Delete Student
    public boolean deleteStudent(int rollNo) {
        Student student = getStudentByRollNo(rollNo);
        if (student != null) {
            students.remove(student);
            System.out.println(" Student deleted!");
            return true;
        }
        System.out.println("Student not found!");
        return false;
    }
}
