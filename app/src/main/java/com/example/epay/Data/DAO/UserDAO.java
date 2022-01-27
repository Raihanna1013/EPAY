package com.example.epay.Data.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.epay.Data.Model.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Query("SELECT * FROM User")
    List<User> getAll();

    @Query("SELECT * FROM User WHERE id LIKE :mahasiswaId LIMIT 1")
    User findById(int mahasiswaId);

    @Insert
    void insertData(User mahasiswa);

    @Update
    void update(User mahasiswa);

    @Delete
    void delete(User mahasiswa);
}
