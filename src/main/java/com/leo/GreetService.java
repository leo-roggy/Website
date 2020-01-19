package com.leo;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Salut toi !";
        } else {
            return "Salut " + name + " !";
        }
    }

}
