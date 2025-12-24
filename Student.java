/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.project;

public class Student extends Person {
    private int age;
    private String Gradelvl;

    public Student(String Gradelvl, int age, String name, String id, String Email, String phone) {
        super(name, id, Email, phone);
        this.Gradelvl = Gradelvl;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGradeLvl() {
        return Gradelvl;
    }
    @Override
    public String toString() {
    return "Name: " + name +
           ", ID: " + id +
           ", Email: " + Email +
           ", Phone: " + phone;
}


    
}
