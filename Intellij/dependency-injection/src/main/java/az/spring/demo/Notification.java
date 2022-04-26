package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Notification {

    private Message message;


    private Employee employee;

    @Autowired
    public Notification(@Qualifier("email") Message message, Employee employee) {
        this.message = message;
        this.employee = employee;
    }

    public Notification() {
        System.out.println("Notification constructor worked");
    }


    public void alert() {
        System.out.println("Notification...");
        System.out.println(employee);
        message.send();
    }

    @PostConstruct
    public void myInit() {
        System.out.println("My init method worked.");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("destroy method worked");
    }


}
