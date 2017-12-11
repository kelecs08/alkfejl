package elte.cinema2.repository;

import elte.cinema2.entity.Performance;
import elte.cinema2.entity.Seat;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {
    
    List<Seat> findAllByRoomName(String roomName);
    List<Seat> findAllByPerformance(Performance performance);
}
