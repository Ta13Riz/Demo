package az.spring.jdbc;

import az.spring.jdbc.config.SpringJdbConfig;
import az.spring.jdbc.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbConfig.class);
        EmployeeDao employeeDao= context.getBean(EmployeeDao.class);
        long count = employeeDao.count();
        System.out.println("count: "+count);
    }
}
