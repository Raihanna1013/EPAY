package com.example.epay.Data.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.epay.Data.DAO.UserDAO;
import com.example.epay.Data.Model.User;

@Database(entities = {User.class}, version = 5)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDAO userDao();
}
