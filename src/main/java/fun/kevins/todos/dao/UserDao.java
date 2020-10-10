package fun.kevins.todos.dao;

import fun.kevins.todos.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}