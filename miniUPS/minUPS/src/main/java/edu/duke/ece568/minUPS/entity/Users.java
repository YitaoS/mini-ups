package edu.duke.ece568.minUPS.entity;

import javax.persistence.*;

@Entity
@Table
public class Users {
    @Id
    private Integer id;

    @Column(nullable = false, unique = true)
    private Integer upsID;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpsID() {
        return upsID;
    }

    public void setUpsID(Integer name) {
        this.upsID = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
