import java.util.*;
public class PhoneBook {
    private Map<String, Set<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }

    public List<String> getContactsSortedByPhoneNumberCount() {
        List<String> sortedContacts = new ArrayList<>(contacts.keySet());
        sortedContacts.sort((name1, name2) ->
                Integer.compare(contacts.get(name2).size(), contacts.get(name1).size()));
        return sortedContacts;
    }

    public Set<String> getPhoneNumbers(String name) {
        return contacts.getOrDefault(name, Collections.emptySet());
    }
}