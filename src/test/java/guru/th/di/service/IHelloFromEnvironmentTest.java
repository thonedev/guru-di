package guru.th.di.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("qa")
@SpringBootTest
class IHelloFromEnvironmentTest {

    @Autowired
    IHelloFromEnvironment hello;

    @Test
    void helloEnv(){
        hello.seyHello();
    }
}