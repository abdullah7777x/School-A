/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.project;

/**
 *
 * @author ASUS
 */
public class ClassRoom {

    private String className;
    private int capacity;

    public ClassRoom(String className, int capacity) {
        this.className = className;
        this.capacity = capacity;
    }

   

    public String getClassName() {
        return className;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayClassRoom() {
        
        System.out.println("Class Name : " + className);
        System.out.println("Capacity : " + capacity);
    }
}
