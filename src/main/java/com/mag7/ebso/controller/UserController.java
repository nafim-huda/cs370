package com.mag7.ebso.controller;

import com.mag7.ebso.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    List<User> getUsers() {
        List<User> users = new ArrayList();
        User user1 = new User("John",
                            "Doe",
                            null,
                            "111-222-3333",
                            "john.doe@mag7.com",
                            true);
        user1.setId(1l);
        User user2 = new User("Jane",
                "Doe",
                null,
                "111-222-3334",
                "jane.doe@mag7.com",
                false);
        user1.setId(1l);

        users.add(user1);
        users.add(user2);

        return users;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        System.out.println("Incoming id:  " + id);
        User user1 = new User("John",
                "Doe",
                null,
                "111-222-3333",
                "john.doe@mag7.com",
                true);
        user1.setId(1l);

        return user1;

    }
}
