public class SmsNotification extends BaseNotification {
    @Override
    public int getCharacterLimit() {
        return 160;
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating SMS with API Key...");
    }

    @Override
    public void send(String recipient, String message) {
        authenticate();
        String finalMessage = message;
        if (message.length() > getCharacterLimit()) {
            finalMessage = message.substring(0, getCharacterLimit());
            System.out.println("Message truncated to " + getCharacterLimit() + " characters.");
        }
        System.out.println("Sending SMS to [" + recipient + "] with ID [" + getNotificationId() + "]: " + finalMessage);
    }
}
