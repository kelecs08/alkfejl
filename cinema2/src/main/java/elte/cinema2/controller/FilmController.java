package elte.cinema2.controller;

import elte.cinema2.entity.Film;
import elte.cinema2.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {
    
    @Autowired
    private FilmRepository filmRepository;
    
    @GetMapping("") //lekérés
    public ResponseEntity<Iterable<Film>> getAllFilms() {
        Iterable<Film> films = filmRepository.findAll();
        return ResponseEntity.ok(films);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Film> getOne(@PathVariable Long id) {
        Film film = filmRepository.findOne(id);
        return ResponseEntity.ok(film);
    }
    
    
    @PostMapping("") //új létrehozása
    public ResponseEntity<Film> create(@RequestBody Film film) {
        Film saved = filmRepository.save(film);
        return ResponseEntity.ok(saved);
    }
    
    @PutMapping("/{id}") //módosítás
    public ResponseEntity<Film> update(@PathVariable Long id, @RequestBody Film film) {
        Film current = filmRepository.findOne(id);
        current.setTitle(film.getTitle());
        current.setDirector(film.getDirector());
        current.setSynopsis(film.getSynopsis());
        current.setLength(film.getLength());
        Film saved = filmRepository.save(current);
        return ResponseEntity.ok(saved);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id) {
        filmRepository.delete(id);
        return ResponseEntity.ok().build();
    }
}
