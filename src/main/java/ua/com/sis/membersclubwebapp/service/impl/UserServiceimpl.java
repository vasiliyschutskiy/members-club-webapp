package ua.com.sis.membersclubwebapp.service.impl;

import org.springframework.stereotype.Service;
import ua.com.sis.membersclubwebapp.model.User;
import ua.com.sis.membersclubwebapp.repository.UserRepository;
import ua.com.sis.membersclubwebapp.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    private UserRepository userRepository;

    public UserServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users.isEmpty() ? new ArrayList<>() : users;
    }

}

