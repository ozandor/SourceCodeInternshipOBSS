package tr.com.obss.jip.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.jip.dto.CreateNewUserRequest;
import tr.com.obss.jip.dto.UserDto;
import tr.com.obss.jip.exception.UserNotFoundException;
import tr.com.obss.jip.mapper.UserMapper;
import tr.com.obss.jip.model.Book;
import tr.com.obss.jip.model.Image;
import tr.com.obss.jip.model.User;
import tr.com.obss.jip.repository.ImageRepository;
import tr.com.obss.jip.repository.UserRepository;
import tr.com.obss.jip.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    private final UserMapper userMapper;


    private ImageRepository imageRepository;

    @Override
    public List<UserDto> getAllUsers() {
        final Iterable<User> allUsers = userRepository.findAll();
        List<UserDto> retList = new ArrayList<>();
        allUsers.forEach(user -> retList.add(userMapper.mapTo(user)));
        //List.of(UserDto.builder().name("Doruk1").Surname("Yavuz").age(20).city("Edirne").build(), UserDto.builder().name("Doruk").Surname("Yavuz").age(20).city("Edirne").build(), UserDto.builder().name("Doruk2").Surname("Yavuz").age(20).city("Edirne").build(), UserDto.builder().name("Doruk4").Surname("Yavuz").age(20).city("Edirne").build(), UserDto.builder().name("Doruk5").Surname("Yavuz").age(20).city("Edirne").build(), UserDto.builder().name("Doruk7").Surname("Yavuz").age(20).city("Edirne").build(), UserDto.builder().name("Doruk9").Surname("Yavuz").age(20).city("Edirne").build());

        //throw new UserNotFoundException("Bu bir testtir. Eyvah..");
        return retList;
    }

    @Override
    public void createNewUser(CreateNewUserRequest createNewUserRequest) {
        User user = new User();
        user.setName(createNewUserRequest.getName());
        user.setSurname(createNewUserRequest.getSurname());
        user.setAge(createNewUserRequest.getAge());
        user.setCity(createNewUserRequest.getCity());
        user.setAddress(createNewUserRequest.getAddress());

        final Image image = Image.builder().location("Edrne").height(99).width(98).build();
        final Image savedImage = imageRepository.save(image);

        user.setProfileImage(savedImage);

        Book book1 = new Book();
        book1.setName("Efendi of Rings");
        book1.setIsbn("bu ne");
        book1.setUser(user);

        user.setBooks(List.of(book1));

        userRepository.save(user);
    }

    @Override
    public UserDto findByName(String name) {
        final User user = userRepository.findUserByName(name);//.orElseThrow(UserNotFoundException::new);
        return UserDto.builder().name(user.getName()).Surname(user.getSurname()).age(user.getAge()).build();
    }

    @Override
    public User findByUsername(String username) {
        Objects.requireNonNull(username,"Username cannot be null.");
        return userRepository.findUserByUsername(username);
    }
}
