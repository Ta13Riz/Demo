package az.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApplication {

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.registerShutdownHook();

        Notification notification = context.getBean("notification", Notification.class);

            notification.alert();

    }

}
