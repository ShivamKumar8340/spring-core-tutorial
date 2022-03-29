package com.springCore.first;

public class Student {
    private int id;
    private String studentName;
    private String studentAddress;

    public Student() {}

    public Student(int id, String studentName, String studentAddress) {
        this.id = id;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setting id");
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println(" setting studentName");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("setting studnetAddress");
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
