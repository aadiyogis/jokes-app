package com.learning.jokes.app.controller;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * aditya created on 17/08/20
 */
@Controller
public class JokesController {

    private ChuckNorrisQuotes quotes;

    public JokesController() {
        quotes = new ChuckNorrisQuotes();
    }

    @GetMapping({"/", ""})
    public String getJokes(Model model) {
        String randomQuote = quotes.getRandomQuote();
        System.out.println("Random quote : " + randomQuote);
        model.addAttribute("joke", randomQuote);
        return "joke/chucknorris";
    }
}
