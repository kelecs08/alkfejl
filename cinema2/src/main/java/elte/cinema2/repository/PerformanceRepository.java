package elte.cinema2.repository;

import elte.cinema2.entity.Performance;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PerformanceRepository extends CrudRepository<Performance, Long> {
    
    List<Performance> findAllByFilmId(Long filmId);
//    List<Performance> findAllByRoom(Room room);
    List<Performance> findAllByStartingTime(Date startingTime);
}
