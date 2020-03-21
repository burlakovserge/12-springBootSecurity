package com.example.toDoList.controller;

import com.example.toDoList.model.Task;
import com.example.toDoList.repos.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
        public String greeting(Model model){
        return "home";
        }

    @GetMapping("/main")
    public String list(Model model) {
        Iterable<Task> taskIterable = taskRepository.findAll();
        model.addAttribute("tasks", taskIterable);
        return "main";
    }

    @PostMapping("/main")
    public String addTask(@RequestParam String name, @RequestParam String commentary,
                          Model model) {
        Task task = new Task(name, commentary);
        taskRepository.save(task);
        Iterable<Task> taskIterable = taskRepository.findAll();
        model.addAttribute("tasks", taskIterable);
        return "main";
    }

    //не смог понять как из формы html принимать id и передавать в метод ниже
//    @DeleteMapping
//    public String deleteTask(@RequestParam int id) {
//        taskRepository.deleteById(id);
//        return "index";
//    }

}