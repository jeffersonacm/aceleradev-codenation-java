package br.com.jefferson.partymanagement.controller;

import br.com.jefferson.partymanagement.model.Guest;
import br.com.jefferson.partymanagement.repository.GuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
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

    @PostMapping
    public String save(@Valid Guest guest, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            this.list();
        }

        this.guestsRepository.save(guest);
        return "redirect:/guests";
    }

}
