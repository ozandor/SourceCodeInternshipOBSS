package tr.com.obss.jip.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.obss.jip.dto.CreateNewUserRequest;
import tr.com.obss.jip.dto.UserDto;
import tr.com.obss.jip.model.User;
import tr.com.obss.jip.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDto> getAllUsers(){

        return userService.getAllUsers();
    }

    @PostMapping
    public Boolean createNewUser(@RequestBody @Valid CreateNewUserRequest createNewUserRequest){

        userService.createNewUser(createNewUserRequest);
        return Boolean.TRUE;

    }

    @GetMapping("/{username}")
    public UserDto findByName(@PathVariable("username") String name){

        return userService.findByName(name);

    }



}


