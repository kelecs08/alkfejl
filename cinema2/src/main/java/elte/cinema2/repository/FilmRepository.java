package elte.cinema2.repository;

import elte.cinema2.entity.Film;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
    
    List<Film> findAllByTitle(String title);
}
