package hu.elte.alkfejl.service;

import hu.elte.alkfejl.entity.User;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope //megőrzi a benne lévő propertiket kérések között ~ adattárolásra használjuk
@Data
public class SessionService {
    private User currentUser;
    
}
