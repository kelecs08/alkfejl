package elte.cinema2.repository;

import elte.cinema2.entity.Room;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> findAllByName(String name);
}
