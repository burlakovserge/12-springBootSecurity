package com.example.toDoList.controller;

//import main.model.BookRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String index() {
        return (new Date()).toString();
    }

}