package com.example.model;


public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private boolean available;

    public Student(int rollNo, String name, double marks, boolean available) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.available = available;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", available=" + available +
                '}';
    }
}
