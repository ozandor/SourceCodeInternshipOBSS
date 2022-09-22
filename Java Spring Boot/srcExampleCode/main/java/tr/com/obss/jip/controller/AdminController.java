package tr.com.obss.jip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.obss.jip.service.UserService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private UserService userService;

    @PostConstruct
    public void init(){


    }


    @PreDestroy
    public void destroy(){


    }

    @Autowired
    public AdminController(UserService userService){

        this.userService = userService;
    }

}
