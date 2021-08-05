package com.example.hellocd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HellocdApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellocdApplication.class, args);
	}

}

@RestController
class Hello {

    @RequestMapping("/")
    String index() {
        return "Welcome to the Homepage";
    }
}
