package ru.mrbrown.springboot312package.dao;



import ru.mrbrown.springboot312package.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List <User> getAllUsers ();
    User update(int id, User user);
    void delete(int id);
    User getUserById (int id);
}
