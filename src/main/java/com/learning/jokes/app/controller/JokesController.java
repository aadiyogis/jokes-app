package com.learning.jokes.app.controller;

import com.learning.jokes.app.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * aditya created on 17/08/20
 */
@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String getJokes(Model model) {
        String randomQuote = jokeService.getJoke();
        System.out.println("Random quote : " + randomQuote);
        model.addAttribute("joke", randomQuote);
        return "joke/chucknorris";
    }
}
