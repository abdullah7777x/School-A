/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.project;

/**
 *
 * @author ASUS
 */
public class Teacher extends User{
    
    private String Email;
    private String Subject;
    private String Classes;

   
    public Teacher(String Email, String Subject, String Classes, String name, String id, String password, String role) {
        super(name, id, password, role);
        this.Email = Email;
        this.Subject = Subject;
        this.Classes = Classes;
    }
    
     public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String Classes) {
        this.Classes = Classes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getRole() {
        return Role;
    }

    @Override
    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String getContact() {
        return Contact;
    }

    @Override
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

}
