package elte.cinema2.controller;

import elte.cinema2.entity.Room;
import elte.cinema2.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {
    
    @Autowired
    private RoomRepository roomRepository;
    
    @GetMapping("") //lekérés
    public ResponseEntity<Iterable<Room>> getAllRooms() {
        Iterable<Room> rooms = roomRepository.findAll();
        return ResponseEntity.ok(rooms);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Room> getOne(@PathVariable Long id) {
        Room room = roomRepository.findOne(id);
        return ResponseEntity.ok(room);
    }
    
}
