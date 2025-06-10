package Notify;

public class demo {

    public static void main(String[] args) {

        Notification notification = new Notification(message);
        EmailNotification emailNotification = new EmailNotification(message);
        SmsNotification smsNotification = new SmsNotification(message);

        Notification[] Notification = {notification, emailNotification, smsNotification};

        for (Notification i : Notification) {
            i.send(message);
        }

        System.out.println("Количество уведомлений: " + Notification.length);
    }


}
