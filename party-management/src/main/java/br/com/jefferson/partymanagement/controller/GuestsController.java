package br.com.jefferson.partymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestsController {

    @GetMapping("/guests")
    public String list() {
        return "GuestList";
    }
}