package com.meli.interview.back.subscription_api.controllers;

import com.meli.interview.back.subscription_api.dao.impl.UserDAO;
import com.meli.interview.back.subscription_api.models.User;
import com.meli.interview.back.subscription_api.models.forms.UserForm;
import com.meli.interview.back.subscription_api.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@Valid @RequestBody @NotNull UserForm request) {
        User newUser = userService.createUser(request.getName());
        return ResponseEntity.ok("user saved, id: ".concat(newUser.getId()));
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable @NotNull(message = "id cannot be null")
                                                @NotBlank(message = "id cannot be blank") String id){
        User user = userService.getUserById(id);
        HttpStatus status = user != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(user, status);
    }

}
