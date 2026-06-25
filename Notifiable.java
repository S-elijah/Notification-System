import java.time.LocalDateTime;

public interface Notifiable {
    void send(String recipient, String message);

    default void logStatus() {
        System.out.println("Notification status logged at " + LocalDateTime.now());
    }
}
