package guru.th.di.service;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello() {
        return "Hello from Service!";
    }
}
