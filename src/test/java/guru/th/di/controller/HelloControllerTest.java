package guru.th.di.controller;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void sayHello(){
        var controller = new HelloController();

        System.out.println(controller.getHello());
    }

}