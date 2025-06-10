package Notify;

public class EmailNotification extends Notification {
    private String email;

    public EmailNotification(String email, String message) {
        this.priority = Notify.priority.HIGH;
    }

    @Override
    public String send() {
        System.out.println("Sending e-mail to …");
        super.send();
    }

}