package msa.controller;

import msa.DTO.UserDTO;
import msa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @PostMapping("/users/signUp")
    public UserDTO signUp(@RequestBody UserDTO user){
        return userService.signUp(user);
    }

    @PostMapping("/users/login")
    public UserDTO login(@RequestBody UserDTO user){
        boolean isUser = userService.login(user);
        if(isUser){
            return user;
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}