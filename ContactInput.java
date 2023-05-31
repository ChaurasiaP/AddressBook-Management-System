import java.util.List;
import java.util.Scanner;

// UC 2
public class ContactInput {
    public static List<ContactDetails> contactDetailsList = ContactList.getContacts();
    public static Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.println("Enter number of contacts you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            ContactDetails contact = new ContactDetails();

            System.out.println("Enter First Name");
            contact.setFirst_name(sc.nextLine());

            System.out.println("Enter Last Name: ");
            contact.setLast_name(sc.nextLine());

            System.out.println("Enter Address: ");
            contact.setAddress(sc.nextLine());

            System.out.println("Enter City Name: ");
            contact.setCity(sc.nextLine());

            System.out.println("Enter Email: ");
            contact.setEmail(sc.nextLine());

            System.out.println("Enter Zip Code: ");
            contact.setZip_code(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter Phone Number: ");
            contact.setPhone_number(sc.nextLine());

            contactDetailsList.add(contact);
            ContactList.setContacts(contactDetailsList);
        }
    }
}
