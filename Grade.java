/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.project;

/**
 *
 * @author ASUS
 */
public class Grade {

    private int gradeId;
    private double score;
    private String remarks;

    public Grade(int gradeId, double score, String remarks) {
        this.gradeId = gradeId;
        this.score = score;
        this.remarks = remarks;
    }

   
    public int getGradeId() {
        return gradeId;
    }

    public double getScore() {
        return score;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void displayGrade() {
        System.out.println("Grade ID: " + gradeId);
        System.out.println("Score: " + score);
        System.out.println("Remarks: " + remarks);
    }
}

