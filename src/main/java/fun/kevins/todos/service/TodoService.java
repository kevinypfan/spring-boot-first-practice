package fun.kevins.todos.service;

import fun.kevins.todos.dao.TodoDao;
import fun.kevins.todos.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoDao todoDao; // 取得Dao物件

    public Iterable<Todo> getTodos() {
        return todoDao.findAll();
    }
}
