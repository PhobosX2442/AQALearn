package Notify;

public class Notification {
    private final int id;
    private String message;
    private Priority priority;
    private static int nextId = 1;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public int getId() {
        return id;
    }

    public Notification(Priority priority, String message) {
        this.message = message;
        this.priority = priority;
        this.id = nextId++;
    }

    public Notification() {
        this.message = "empty";
        this.priority = Priority.NORMAL;
        this.id = nextId++;
    }


    public void send() {
        System.out.println("id: " + getId());
        System.out.println("Приоритет: " + getPriority());
        System.out.println("Сообщение: " + getMessage());
        System.out.println();

    }

    public void send(String extra) {
        System.out.println("Notification: " + message);
        System.out.println("extra");
    }
}
