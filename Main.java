
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.mathUtils;

public class Main {
    public static void main(String[] args) {
        int result = mathUtils.add(3, 4);
        System.out.println("Wynik:" + result);
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("test");

    }
}
