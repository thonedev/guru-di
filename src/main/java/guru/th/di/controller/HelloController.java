package guru.th.di.controller;

import guru.th.di.service.HelloServiceImpl;
import guru.th.di.service.IHelloService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private final IHelloService helloService;

    public HelloController() {
        this.helloService = new HelloServiceImpl();
    }

    public String getHello(){
        System.out.println("Hello!");

        return helloService.sayHello();
    }
}
