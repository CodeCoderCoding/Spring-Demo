package com.supremepole.a01springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}
