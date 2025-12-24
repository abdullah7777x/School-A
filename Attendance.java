/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.project;

/**
 *
 * @author ASUS
 */
public class Attendance {

    private int attendanceId;
    private String date;
    private String status; 

    
    public Attendance(int attendanceId, String date, String status) {
        this.attendanceId = attendanceId;
        this.date = date;
        this.status = status;
    }

  
    public int getAttendanceId() {
        return attendanceId;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

   
    public void setStatus(String status) {
        this.status = status;
    }

    
    public void displayAttendance() {
        System.out.println("Attendance ID : " + attendanceId);
        System.out.println("Date : " + date);
        System.out.println("Status : " + status);
    }
}

