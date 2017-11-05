package hu.elte.alkfejl.repository;

import hu.elte.alkfejl.entity.Film;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {
    
    List<Film> findAllByTitle(String title);
}
