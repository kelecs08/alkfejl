package elte.cinema2.repository;

import elte.cinema2.entity.Performance;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PerformanceRepository extends CrudRepository<Performance, Long> {
    
    List<Performance> findAllByStartingTime(Date startingTime);

}
