package az.spring.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private double salary;

    private Set<Device> device;
    private Map<String, Device> deviceMap;

    private Properties databaseProperties;



    public Employee() {
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Device> getDevice() {
        return device;
    }

    public void setDevice(Set<Device> device) {
        this.device = device;
    }

    public Map<String, Device> getDeviceMap() {
        return deviceMap;
    }

    public void setDeviceMap(Map<String, Device> deviceMap) {
        this.deviceMap = deviceMap;
    }

    public Properties getDatabaseProperties() {
        return databaseProperties;
    }

    public void setDatabaseProperties(Properties databaseProperties) {
        this.databaseProperties = databaseProperties;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", device=" + device +
                ", deviceMap=" + deviceMap +
                ", databaseProperties=" + databaseProperties +
                '}';
    }
}
