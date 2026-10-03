//Max Hicks
package com.soit.enterprise.model;

public class Faculty {

    private int id;
    private String firstName;
    private String lastName;
    private String title;
    private String email;

    public Faculty(){

    }

    public Faculty(int id, String firstName, String lastName, String title, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
