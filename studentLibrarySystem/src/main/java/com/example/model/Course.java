package com.example.model;

public class Course {
    private String courseName;
    private int duration;
    private boolean active;

    public Course(String courseName, int duration, boolean active) {
        this.courseName = courseName;
        this.duration = duration;
        this.active = active;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getCourseDuration() {
        return duration;
    }

    public boolean isCourseActive() {
        return active;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDuration(int duration) {
        this.duration = duration;
    }

    public void setCourseActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", active=" + active +
                '}';
    }
}
