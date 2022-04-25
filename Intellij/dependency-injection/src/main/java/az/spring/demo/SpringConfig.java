package az.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean("sms")
    public Message getSms() {
        return new Sms();
    }

    @Bean("email")
    public Message getEmail() {
        return new Email();
    }

    @Bean
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setName("Tabriz");
        employee.setSurname("Guliyev");
        return employee;
    }


    @Bean("email-notification")
    @Scope("prototype")
    public Notification getNotification(@Qualifier("email") Message message, Employee employee) {
        Notification notification = new Notification();
        notification.setMessage(message);
        notification.setEmployee(employee);
        return notification;
    }
    @Bean(initMethod = "myInit", destroyMethod = "myDestroy",name = "notification")
    @Scope("singleton")
    public Notification getNotification2(@Qualifier("sms") Message message, Employee employee) {
        Notification notification = new Notification();
        notification.setMessage(message);
        notification.setEmployee(employee);
        return notification;
    }



}
