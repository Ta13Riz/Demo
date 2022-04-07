package az.spring.demo;

public class Notification {
    private Message message;
    private Employee employee;


    //contructor injection
    public Notification(Message message, Employee employee) {
        this.message = message;
        this.employee = employee;
    }

//    public void setMessage(Message message) {
//        this.message = message;
//    }

    public void alert() {
        System.out.println("Notification...");
        System.out.println(employee);

        message.send();
    }
}
