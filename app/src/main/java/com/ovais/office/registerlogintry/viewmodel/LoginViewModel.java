package com.ovais.office.registerlogintry.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ovais.office.registerlogintry.model.User;
import com.ovais.office.registerlogintry.repository.AppRepository;

import java.util.List;

public class LoginViewModel extends ViewModel {
    private LiveData<List<User>> userLiveData;
    private AppRepository appRepository;
    public String email, password;

    public LoginViewModel(@NonNull Application application) {
        appRepository = new AppRepository(application);
        userLiveData = appRepository.getAllUsers();
    }

    public void authenticateUser(){

    }


}
