/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.project;

/**
 *
 * @author ASUS
 */
public class User {
    
    protected String name;
    protected String id;
    protected String Role;
    protected String Contact;

   

    public User(String name, String id, String password, String role) {
        this.name = name;
        this.id = id;
        this.Contact = password;
        this.Role = role;
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        this.Role = role;
    }
    
    
}
