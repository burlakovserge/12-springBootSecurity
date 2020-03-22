package com.example.toDoList.controller;

import com.example.toDoList.model.Task;
import com.example.toDoList.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private TaskRepo taskRepo;

    @GetMapping("/")
        public String greeting(Model model){
        return "home";
        }

    @GetMapping("/main")
    public String list(Model model) {
        Iterable<Task> taskIterable = taskRepo.findAll();
        model.addAttribute("tasks", taskIterable);
        return "main";
    }

    @PostMapping("/main")
    public String addTask(@RequestParam String name, @RequestParam String commentary,
                          Model model) {
        Task task = new Task(name, commentary);
        taskRepo.save(task);
        Iterable<Task> taskIterable = taskRepo.findAll();
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