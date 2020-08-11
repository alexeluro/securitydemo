package com.example.securitydemo.student;

public class Student {

    private final Integer studentId;
    private final String studentname;

    public Student(Integer studentId, String studentname) {
        this.studentId = studentId;
        this.studentname = studentname;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentname() {
        return studentname;
    }
}
