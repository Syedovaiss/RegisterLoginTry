package com.ovais.office.registerlogintry.viewmodel;


import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ovais.office.registerlogintry.model.User;
import com.ovais.office.registerlogintry.repository.AppRepository;

import java.util.List;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class RegisterViewModel extends ViewModel {
    private LiveData<List<User>> userLiveData;
    private AppRepository appRepository;
    public String email, password, name;

    public RegisterViewModel(@NonNull Application application) {
        appRepository = new AppRepository(application);
        userLiveData = appRepository.getAllUsers();
    }

    public LiveData<List<User>> getAllUsers() {
        return userLiveData;
    }

    private void insertUser() {
        User user = new User(name, email, password);
        appRepository.insertUser(user);
    }


    public void onRegister() {

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || password.length() < 5 || password.length() > 8) {
            Log.e(TAG, "onRegister: Invalid Inputs");
        } else {
            insertUser();
            Log.i("Inserted:", " Email: " + email + " Password: " +
                    password + "Name: " + name);
        }
    }

}

