package com.leo.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GreetService implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3433469777016758173L;

	public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Salut toi !";
        } else {
            return "Salut " + name + " !";
        }
    }

}
