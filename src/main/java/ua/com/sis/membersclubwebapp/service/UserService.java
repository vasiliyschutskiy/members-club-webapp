package ua.com.sis.membersclubwebapp.service;

import ua.com.sis.membersclubwebapp.model.User;

import java.util.List;

public interface UserService {
    User create(User user);
    void delete(long id);
    List<User> getAll();

}