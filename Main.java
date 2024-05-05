
import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.mathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;
        Messenger messenger = new EmailMessenger();

        try {
            people[1] = new Person("Michal Kowalski", 18);
            int value1 = mathUtils.add(people[1].getAge(), b);
            messenger.sendMessage("Wartosc dla" + people[1] + ";" + value1);

            people[2] = new Person("Oliwia Kowlaczyk", 37);
            int value2 = mathUtils.add(people[2].getAge(), b);
            messenger.sendMessage("Wartosc dla" + people[2] + ";" + value2);

            people[3] = new Person("Iga Marcin", 42);
            int value3 = mathUtils.add(people[3].getAge(), b);
            messenger.sendMessage("Wartosc dla" + people[3] + ";" + value3);

            people[4] = new Person("Ewa Majewska", 23);
            int value4 = mathUtils.add(people[4].getAge(), b);
            messenger.sendMessage("Wartosc dla" + people[4] + ";" + value4);

            people[5] = new Person("Adam Wójcik ", 21);
            int value5 = mathUtils.add(people[5].getAge(), b);
            messenger.sendMessage("Wartosc dla" + people[5] + ";" + value5);

        } catch (InvalidAgeException e) {
            System.out.println("Invalid age " + e.getMessage());

        }

    }
}