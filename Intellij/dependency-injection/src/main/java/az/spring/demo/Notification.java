package az.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Notification {
    @Autowired
   @Qualifier("sms")
    private Message message;

    @Autowired
    private Employee employee;

    public Notification() {
        System.out.println("Notification constructor worked");
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    //setter injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void alert() {
        System.out.println("Notification...");
        System.out.println(employee);
        message.send();
    }

    public void myInit() {
        System.out.println("My init method worked.");
    }

    public void myDestroy() {
        System.out.println("destroy method worked");
    }


}
