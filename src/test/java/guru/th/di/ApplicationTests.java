package guru.th.di;

import guru.th.di.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext ctx;

	@Autowired
	HelloController helloController;

	@Test
	void testAutowiredController(){
		System.out.println(helloController.getHello());
	}

	@Test
    void testGetControllerFromCtx(){
		HelloController controller = ctx.getBean(HelloController.class);

		System.out.println(controller.getHello());
	}

	@Test
	void contextLoads() {
	}

}
