import java.util.*;

public class Dz_Java {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Dmitriy", "8(912)-666-22-55");
        phoneBook.addContact("Anna", "8(983)-456-58-98");
        phoneBook.addContact("Anna", "8(912)-155-55-55");
        phoneBook.addContact("Viktor", "8(123)-457-89-98");
        phoneBook.addContact("Maria", "8(555)-236-63-36");

        List<String> sortedContacts = phoneBook.getContactsSortedByPhoneNumberCount();
        for (String name : sortedContacts) {
            System.out.println(name + ": " + phoneBook.getPhoneNumbers(name));
        }
    }
}