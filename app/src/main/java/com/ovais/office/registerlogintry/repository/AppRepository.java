package com.ovais.office.registerlogintry.repository;


import android.app.Application;

import androidx.lifecycle.LiveData;

import com.ovais.office.registerlogintry.database.UserDAO;
import com.ovais.office.registerlogintry.database.UserDb;
import com.ovais.office.registerlogintry.model.User;

import java.util.List;

public class AppRepository {
    private LiveData<List<User>> userList;
    private UserDAO usersDAO;

    public AppRepository(Application application) {

        UserDb usersDb = UserDb.getDb(application);
        usersDAO = usersDb.usersDAO();
        userList = usersDAO.selectAllUsers();


    }

    public void insertUser(User user) {
        usersDAO.insertUser(user);
    }

    public LiveData<List<User>> getAllUsers() {
        return userList;
    }


}