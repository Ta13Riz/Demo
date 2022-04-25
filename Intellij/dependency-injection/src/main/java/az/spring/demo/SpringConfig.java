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


    @Bean(initMethod = "myInit", destroyMethod = "myDestroy", name = "notification")
    public Notification getNotification() {
        Notification notification = new Notification();

        return notification;
    }



}
