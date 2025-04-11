package guru.th.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String getHello(){
        System.out.println("Hello!");

        return "Hello returning!";
    }
}
