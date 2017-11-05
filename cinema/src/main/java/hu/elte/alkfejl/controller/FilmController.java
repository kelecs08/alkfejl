package hu.elte.alkfejl.controller;

import hu.elte.alkfejl.entity.Film;
import hu.elte.alkfejl.entity.User;
import hu.elte.alkfejl.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film")
public class FilmController {
    
    @Autowired
    private FilmRepository filmRepository;
    
    @GetMapping("/list")
    public String list(Model model) {
        return null;
    }
    
//   @Role({User.Role.ADMIN}) //annotation value not of an allowable type
    @PostMapping("/add")
    public String addFilm(@ModelAttribute Film newFilm) {
        return null;
    }
    
}
