public class PushNotification extends BaseNotification {
    @Override
    public void authenticate() {
        System.out.println("Authenticating Push Notification...");
    }

    @Override
    public void send(String recipient, String message) {
        authenticate();
        System.out.println("Sending Push to device [" + recipient + "] with ID [" + getNotificationId() + "]: " + message);
    }
}
