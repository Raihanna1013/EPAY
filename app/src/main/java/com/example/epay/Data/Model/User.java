package com.example.epay.Data.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int id =0;

    @ColumnInfo(name = "email")
    private String email = " ";

    @ColumnInfo(name = "password")
    private String password = " ";

    public User(int id, String email, String password){
        this.id = id;
        this.email = email;
    }

    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
