public class EmailNotification extends BaseNotification {
    @Override
    public int getCharacterLimit() {
        return 2000;
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating Email with OAuth...");
    }

    @Override
    public void send(String recipient, String message) {
        authenticate();
        System.out.println("Sending Email to [" + recipient + "] with ID [" + getNotificationId() + "]: " + message);
    }
}
