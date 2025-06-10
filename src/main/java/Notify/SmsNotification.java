package Notify;

public class SmsNotification extends Notification{
    String PhoneNumber;

    public SmsNotification (String PhoneNumber, String message) {
        this.priority = Notify.priority.LOW;
    }

    @Override
    public String send() {
        System.out.println("Sending SMS to …");
        super.send();
    }
}
