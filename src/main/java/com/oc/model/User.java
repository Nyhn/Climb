package com.oc.model;

import javax.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class User {
    /* id */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    /* Login */
    private String pseudo;
    private String password;
    /* profile */
    private String name;
    private String firstname;
    private boolean sex;
    //private Date birth = new Date();
    /* coordonnate */
    private String address;
    private int zip;
    private String mail;
    private int phone;


    @OneToMany(mappedBy ="user")
    private Set<Topos> toposCollection;

    public Set<Topos> getToposCollection() {
        return toposCollection;
    }

    public void setToposCollection(Set<Topos> toposCollection) {
        this.toposCollection = toposCollection;
    }


    public User() {
    }

    /* ----- GETTER AND SETTER ----- */
    /* Login */
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo){
        if(pseudo.length() > 50){}

        else
            this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /* profile */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }

//    public Date getBirth() {
//        return birth;
//    }
//    public void setBirth(String birth) {
//    }

//    /* coordonnate */
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
