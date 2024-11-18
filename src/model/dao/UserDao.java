package model.dao;

import model.dto.User;

import java.util.ArrayList;

public class UserDao {
    private static UserDao userDao = new UserDao();

    public UserDao (){}

    public static UserDao getInstance(){
        return userDao;
    }

    public ArrayList<User> users = new ArrayList<>();

}
