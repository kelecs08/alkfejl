package elte.cinema2.controller;

import elte.cinema2.entity.Film;
import elte.cinema2.entity.Performance;
import elte.cinema2.repository.PerformanceRepository;
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
@RequestMapping("/performance")
public class PerformanceController {
    
    @Autowired
    private PerformanceRepository performanceRepository;
    
    @GetMapping("") //lekérés
    public ResponseEntity<Iterable<Performance>> getAllPerformances() {
        Iterable<Performance> performances = performanceRepository.findAll();
        return ResponseEntity.ok(performances);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Performance> getOne(@PathVariable Long id) {
        Performance performance = performanceRepository.findOne(id);
        return ResponseEntity.ok(performance);
    }
    
    @GetMapping("/selected/{id}")
    public ResponseEntity<Iterable<Performance>> getSelectedFilmsPerformances(@PathVariable Long filmId) {
        Iterable<Performance> selectedPerformances = performanceRepository.findAllByFilmId(filmId);
        return ResponseEntity.ok(selectedPerformances);
    }
    
    @PostMapping("") //új létrehozása
    public ResponseEntity<Performance> create(@RequestBody Performance performance) {
        Performance saved = performanceRepository.save(performance);
        return ResponseEntity.ok(saved);
    }
    
    @PutMapping("/{id}") //módosítás
    public ResponseEntity<Performance> update(@PathVariable Long id, @RequestBody Performance performance) {
        Performance current = performanceRepository.findOne(id);
        current.setFilm(performance.getFilm());
        current.setRoom(performance.getRoom());
        current.setSeats(performance.getSeats());
        current.setStartingTime(performance.getStartingTime());
        Performance saved = performanceRepository.save(current);
        return ResponseEntity.ok(saved);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id) {
        performanceRepository.delete(id);
        return ResponseEntity.ok().build();
    }
}
