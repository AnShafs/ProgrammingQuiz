package io.anshafs.quiz.controller;

import io.anshafs.quiz.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
    @Autowired
    Message message;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("hello", message.getHello());
        return "hello";
    }

}
