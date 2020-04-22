package com.freemind.creativeservices.controller;

import com.freemind.creativeservices.exception.user.UserNotFoundException;
import com.freemind.creativeservices.model.User;
import com.freemind.creativeservices.services.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getUsers() {
        List<User> allUsers = userService.findAllUsers();
        System.out.println(allUsers.size());
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Resource<User> getUserById(@PathVariable String id) {
        User user = userService.findUserById(id);

        if (user == null)
            throw new UserNotFoundException("User not found with id:-" + id);

        //If you use Representation model
        //user.add(linkTo(methodOn(UserController.class).getUserById(user.getUserId())).withSelfRel());
        //user.add(linkTo(methodOn(UserController.class).getUsers()).withRel("all-users"));

        Resource<User> resource = new Resource<User>(user);
        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getUsers());
        resource.add(linkTo.withRel("all-users"));
        return resource;

    }

    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody @Valid User user) {
        User savedUser = userService.addUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getUserId()).toUri();
        System.out.println(location);
        return ResponseEntity.created(location).build();
    }

    //public void deleteUser(@PathVariable)

}
