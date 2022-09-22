package tr.com.obss.jip.service;

import tr.com.obss.jip.model.Role;
import tr.com.obss.jip.model.RoleType;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role findByName(RoleType type);

    void createNewRole(Role role);

}
