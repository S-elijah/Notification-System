Notification System

A Java implementation of a flexible notification framework using interfaces, abstract classes, and inheritance.  
Supports Email, SMS, and Push notifications with different character limits and authentication methods.

Features
- `Notifiable` interface with `send()` and a default `logStatus()`.
- `BaseNotification` abstract class: generates a unique ID, provides a default character limit (500), and enforces `authenticate()`.
- Three concrete subclasses:
  - `EmailNotification` – limit 2000, OAuth authentication.
  - `SmsNotification` – limit 160, truncates long messages, API Key authentication.
  - `PushNotification` – default limit 500, simple authentication.
- Main method demonstrates polymorphic handling of all notifications.
