package com.springCore.javaConfigWithoutXml;

public class Staff {
    private Attendance attendance;

    public  void cleaning() {
        this.attendance.display();
        System.out.println("staff cleaning the office");
    }

    public Staff(Attendance attendance) {
        this.attendance = attendance;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
}
