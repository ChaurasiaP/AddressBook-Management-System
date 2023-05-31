import java.util.ArrayList;
import java.util.List;

//  UC 4
public class ContactList {
    private static List<ContactDetails> contacts = new ArrayList<>();

    public static List<ContactDetails> getContacts() {
        return contacts;
    }

    public static void setContacts(List<ContactDetails> contacts) {
        ContactList.contacts = contacts;
    }
}
