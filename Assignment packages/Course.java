package com.university.department.cse;

public class Course {
    private String courseName;
    private String courseCode;
    private int credits;
    private String instructor;
    
    public Course(String courseName, String courseCode, int credits, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.instructor = instructor;
    }
    
    // Getter methods
    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    // Setter methods
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public void printCourseDetails() {
        System.out.println("=== Course Details ===");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + instructor);
        System.out.println("Department: Computer Science and Engineering");
    }
    
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", credits=" + credits +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
