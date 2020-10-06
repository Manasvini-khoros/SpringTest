package com.example.SpringTest.dao;

import com.example.SpringTest.model.User;
import java.sql.SQLException;
import java.util.List;


public interface UserDao  {
    List<User> getUsers() throws SQLException;

    List<User> getUser(int id) throws SQLException;


    void insertUser(User user) throws SQLException;


    void updateUser(User user, int id) throws SQLException;


    public String deleteUser(int id) throws SQLException;


}
