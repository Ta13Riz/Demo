package az.spring.jdbc;

import az.spring.jdbc.config.SpringJdbConfig;
import az.spring.jdbc.dao.EmployeeDao;
import az.spring.jdbc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbConfig.class);
        EmployeeDao employeeDao= context.getBean(EmployeeDao.class);

        Employee emp = new Employee();
        emp.setName("Ilkin");
        emp.setSurname("Ilkinli");
        emp.setAge(22);
        emp.setSalary(22222);
        emp.setId(2);

        employeeDao.delete(2);

        System.out.println(emp);
        long count = employeeDao.count();
        System.out.println("count: "+count);
        Employee employee = employeeDao.getEmployeeById(1);
        System.out.println(employee);
        System.out.println("-----------------");
        System.out.println(employeeDao.getAllEmployees());
        System.out.println("-----");

    }
}
