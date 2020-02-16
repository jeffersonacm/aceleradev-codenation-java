package br.com.jefferson.partymanagement.controller;

import br.com.jefferson.partymanagement.model.Guest;
import br.com.jefferson.partymanagement.repository.GuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
@RequestMapping("/guests")
public class GuestsController {

    @Autowired
    GuestsRepository guestsRepository;

    @GetMapping
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("GuestList");

        modelAndView.addObject("guests", guestsRepository.findAll());
        modelAndView.addObject(new Guest());

        return modelAndView;
    }

}
