package org.group5.artisanconnect;

import jakarta.persistence.*;

@Entity
@Table(name ="userTable") //Specifies the details of the database table that an
// entity class will be mapped to

public class User
{
    @Id
    @GeneratedValue
    //Class attributes used to create a User
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    private String fullName = firstName + ", " + lastName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phoneNumber;

    //Setters and getters for each respective attribute
    public void setId(Long id) { this.id = id; }
    public Long getId() { return id; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setFullName(String fullName) { this.fullName  = fullName; }
    public String getFullName() { return fullName; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }
}
