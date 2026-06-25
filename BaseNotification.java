import java.util.UUID;

public abstract class BaseNotification implements Notifiable {
    private String notificationId;

    public BaseNotification() {
        this.notificationId = UUID.randomUUID().toString();
    }

    public String getNotificationId() {
        return notificationId;
    }

    public int getCharacterLimit() {
        return 500;
    }

    public abstract void authenticate();
}
