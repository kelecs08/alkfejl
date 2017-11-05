package hu.elte.alkfejl.repository;

import hu.elte.alkfejl.entity.Room;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findAllByName(String name);
}
