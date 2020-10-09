package fun.kevins.todos.controller;

import fun.kevins.todos.entity.Todo;
import fun.kevins.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;//取得Service物件

    @GetMapping("/todos")
    public Iterable<Todo> getTodoList() {
        Iterable<Todo> todoList = todoService.getTodos();
        return todoList;
    }
}