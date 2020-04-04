package behavioral.chain_of_responsibility;

public class SimpleNotifier extends Notifier {

    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Simple Notifier: " + message);
    }
}
