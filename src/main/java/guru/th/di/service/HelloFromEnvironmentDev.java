package guru.th.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service("helloenv")
public class HelloFromEnvironmentDev implements IHelloFromEnvironment {
    @Override
    public void seyHello() {
        System.out.println("Hello Dev");
    }
}
