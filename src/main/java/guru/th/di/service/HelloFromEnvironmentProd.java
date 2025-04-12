package guru.th.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"prod", "default"})
@Service("helloenv")
public class HelloFromEnvironmentProd implements IHelloFromEnvironment {
    @Override
    public void seyHello() {
        System.out.println("Hello Prod!");
    }
}
