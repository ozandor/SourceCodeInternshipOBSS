package tr.com.obss.jip.service;

import tr.com.obss.jip.dto.CreateNewUserRequest;
import tr.com.obss.jip.dto.UserDto;
import tr.com.obss.jip.model.User;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    void createNewUser(CreateNewUserRequest createNewUserRequest);

    UserDto findByName(String name);

    User findByUsername(String username);
}
