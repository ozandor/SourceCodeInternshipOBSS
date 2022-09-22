package tr.com.obss.jip.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.com.obss.jip.model.Role;
import tr.com.obss.jip.model.RoleType;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findRoleByName(RoleType type);
}
