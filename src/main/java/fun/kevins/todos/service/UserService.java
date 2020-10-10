package fun.kevins.todos.service;

import fun.kevins.todos.dao.UserDao;
import fun.kevins.todos.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public Optional<User> getTodosByUserId(Integer id) {
        Optional<User> data = userDao.findById(id);
        return data;
    }
}