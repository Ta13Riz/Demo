package az.spring.demo;

public class  Notification {
    private Message message;
    private Employee employee;


    //contructor injection
    public Notification(Employee employee) {
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
}
