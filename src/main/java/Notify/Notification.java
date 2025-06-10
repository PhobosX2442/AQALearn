package Notify;

public class Notification {
     final int = id;
     String message;
     Priority priority;
     static String nextId;

     public Notification() {
         this.id = id;
         this.message = "empty";
         this.priority = Notify.priority.NORMAL;
     }

     public Notification(String id, String message, Priority Priority) {
         this.id = id;
         this.message = message;
         this.priority = Priority;
     }

    public void send(String message) {
         System.out.println(message);
         this.id = this.nextid++;
    }

    public void sendExtra(String extra) {
        System.out.println(message);
        System.out.println("extra");
        this.id = this.nextid++;
    }

    @Override
    public String toString() {
         return System.out.println(Notification.message);
    }
}
