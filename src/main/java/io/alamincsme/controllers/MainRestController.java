package io.alamincsme.controllers;

import io.alamincsme.dto.UserDTO;
import io.alamincsme.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainRestController {

    @Autowired
    private UserService service ;
    @GetMapping("/user")
    public UserDTO user() {
        return service.getUser();
    }
}
