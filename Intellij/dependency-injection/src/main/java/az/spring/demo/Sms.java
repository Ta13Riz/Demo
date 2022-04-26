package az.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Sms implements Message {
    @Override
    public void send() {
        System.out.println("Sms was send successfully.");
    }
}
