package com.ovais.office.registerlogintry.database;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.ovais.office.registerlogintry.model.User;

import java.util.List;

import static com.ovais.office.registerlogintry.utils.Queries.ALL_USERS;

@Dao
public interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(User user);

    @Query(ALL_USERS)
    LiveData<List<User>> selectAllUsers();
//
//    @Delete
//    void deleteUser();
}
