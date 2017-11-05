package hu.elte.alkfejl.repository;

import hu.elte.alkfejl.entity.Performance;
import hu.elte.alkfejl.entity.Seat;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {
    
    List<Seat> findAllByRoomName(String roomName);
    List<Seat> findAllByPerformance(Performance performance);
}
