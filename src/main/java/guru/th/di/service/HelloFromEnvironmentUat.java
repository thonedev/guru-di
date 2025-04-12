package guru.th.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("helloenv")
public class HelloFromEnvironmentUat implements IHelloFromEnvironment {
    @Override
    public void seyHello() {
        System.out.println("Hello UAT!");
    }
}
