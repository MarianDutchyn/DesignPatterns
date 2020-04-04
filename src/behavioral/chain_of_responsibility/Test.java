package behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        emailNotifier.setNextNotifier(simpleNotifier);
        smsNotifier.setNextNotifier(emailNotifier);

        simpleNotifier.notify("Everything Ok.", Priority.ROUTINE);
        emailNotifier.notify("Something went wrong!", Priority.IMPORTANT);
        smsNotifier.notify("There is a problem!!!", Priority.ASAP);
    }
}
