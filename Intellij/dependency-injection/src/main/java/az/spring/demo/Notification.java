package az.spring.demo;

public class Notification {
    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    public void alert() {
        System.out.println("Notification...");
        message.send();
    }
}
