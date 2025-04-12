package guru.th.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("helloenv")
public class HelloFromEnvironmentQa implements IHelloFromEnvironment {
    @Override
    public void seyHello() {
        System.out.println("Hello QA!");
    }
}
