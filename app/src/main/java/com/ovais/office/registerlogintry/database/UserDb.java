package com.ovais.office.registerlogintry.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.ovais.office.registerlogintry.model.User;

import static com.ovais.office.registerlogintry.utils.Constants.DATABASE_NAME;

@Database(entities = User.class,version =4,exportSchema = false)
public abstract class UserDb extends RoomDatabase {
    public abstract UserDAO usersDAO();

    private static volatile UserDb INSTANCE;

    public static UserDb getDb(Context context) {

        if (INSTANCE == null) {
            synchronized (UserDb.class) {

                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext()
                            , UserDb.class, DATABASE_NAME)
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();

                }
            }
        }
        return INSTANCE;
    }
}
