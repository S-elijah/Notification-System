import java.util.ArrayList;

public class NotificationSystem {
    public static void main(String[] args) {
        ArrayList<Notifiable> notifications = new ArrayList<>();
        String testMessage = "This is a long test message that exceeds the limit for SMS notifications. " +
                           "It will be truncated appropriately when sent.";

        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());

        System.out.println("=== Notification System ===\n");

        for (Notifiable n : notifications) {
            n.send("user@example.com", testMessage);
            n.logStatus();
            System.out.println();
        }
    }
}
