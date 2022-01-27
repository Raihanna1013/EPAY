package com.example.epay.Data.Database;

import android.app.Application;

import androidx.room.Room;

public class MyApp extends Application {
    private static MyApp INSTANCE;
    public static AppDatabase db;
    public static MyApp getInstance(){
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(this,
                AppDatabase.class, "database_user")
                .fallbackToDestructiveMigrationOnDowngrade()
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        INSTANCE = this;

    }
    public AppDatabase getDb() {return db;}
}
