package tr.com.obss.jip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.com.obss.jip.dto.UserDto;
import tr.com.obss.jip.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByName(String name);

    Optional<User> findFirstByName(String name);

    User findUserByUsername(String username);
}
