package elte.cinema2.repository;

import elte.cinema2.entity.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    //felhasználónév és jelszó alapján keres az adatbázisban
    Optional<User> findByUserNameAndPassword(String userName, String password); //vagy megtalálja vagy nem <-- optional
}