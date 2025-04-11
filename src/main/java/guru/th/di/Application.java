package guru.th.di;

import guru.th.di.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(Application.class, args);

		var res = ctx.getBean(HelloController.class).getHello();

		System.out.println(res);
	}

}
