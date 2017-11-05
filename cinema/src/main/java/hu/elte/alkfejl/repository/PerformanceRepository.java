package hu.elte.alkfejl.repository;

import hu.elte.alkfejl.entity.Film;
import hu.elte.alkfejl.entity.Performance;
import hu.elte.alkfejl.entity.Room;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PerformanceRepository extends CrudRepository<Performance, Long> {
    
//    List<Performance> findAllByFilm(Film film);
//    List<Performance> findAllByRoom(Room room);
    List<Performance> findAllByStartingTime(Date startingTime);
}
