package elte.cinema2.controller;

import elte.cinema2.entity.User;
import elte.cinema2.repository.UserRepository;
import elte.cinema2.service.SessionService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SessionService sessionService;
 //   @Autowired
 //   private PasswordEncoder passwordEncoder;
    
    @RequestMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        Optional<User> currentUser = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        if(currentUser.isPresent()) {
            System.out.println("Login successful!");
            sessionService.setCurrentUser(currentUser.get());
            return ResponseEntity.ok(currentUser.get());
        } else {
            System.out.println("Login failed.");
            return ResponseEntity.status(403).build();
        }
    }
    
    @RequestMapping("/logout")
    public ResponseEntity logout() {
        sessionService.setCurrentUser(null);
        return ResponseEntity.ok(false);
    }
    
    @GetMapping("/user")
    public ResponseEntity getUser() {
        if (sessionService.getCurrentUser() == null) {
            return ResponseEntity.ok(false);
        } else {
            return ResponseEntity.ok(sessionService.getCurrentUser());
        }
    }
}
