package com.ovais.office.registerlogintry.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


import static com.ovais.office.registerlogintry.utils.Constants.COLUMN_EMAIL;
import static com.ovais.office.registerlogintry.utils.Constants.COLUMN_ID;
import static com.ovais.office.registerlogintry.utils.Constants.COLUMN_NAME;
import static com.ovais.office.registerlogintry.utils.Constants.COLUMN_PASSWORD;
import static com.ovais.office.registerlogintry.utils.Constants.COLUMN_PHONE;
import static com.ovais.office.registerlogintry.utils.Constants.TABLE_NAME;

@Entity(tableName = TABLE_NAME)
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    private int id;

    @ColumnInfo(name = COLUMN_EMAIL)
    private String email;

    @ColumnInfo(name = COLUMN_PASSWORD)
    private String password;
    @ColumnInfo(name = COLUMN_NAME)
    private String name;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
