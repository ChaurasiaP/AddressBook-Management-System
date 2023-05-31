import java.util.List;
import java.util.Scanner;

// UC 3
public class ContactInput {
    public static List<ContactDetails> contactDetailsList = ContactList.getContacts();
    public static Scanner sc = new Scanner(System.in);


    // adding contact to arraylist contacts of type ContactDetails
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
    // to display all the contacts using arraylist contactDetailsList which take values from contacts
    public void displayContacts() {
        if (contactDetailsList.isEmpty()) {
            System.out.println("AddressBook is empty! Press 1 to add contact");
        }
        for (ContactDetails contact : contactDetailsList) {
            System.out.print(contact);
            System.out.println(" ");
        }
    }

    // to edit the details of any contact using their first name and last name
    public void editContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lname = sc.nextLine();

        String fonud = "no";    // checking condition if contact is not present

        for (ContactDetails contact : contactDetailsList) {
            if (contact.getFirst_name().compareToIgnoreCase(fname) == 0 && contact.getLast_name().compareToIgnoreCase(lname) == 0) {
                System.out.println("Contact Found! Edit Details");
                fonud = "yes";
                int exit = 0;

                while (exit == 0) {
                    System.out.println("Press \n1.Edit Address \t\t2. Edit City \n3. Edit Email \t\t4.Edit Zip Code \n5. Edit Phone Number ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter New address: ");
                            contact.setAddress(sc.nextLine());
                            break;

                        case 2:
                            System.out.println("Enter new city name: ");
                            contact.setCity(sc.nextLine());
                            break;

                        case 3:
                            System.out.println("Enter new email");
                            contact.setEmail(sc.nextLine());
                            break;

                        case 4:
                            System.out.println("Enter new zip code");
                            contact.setZip_code(sc.nextInt());
                            sc.nextLine();
                            break;

                        case 5:
                            System.out.println("Enter new phone number");
                            contact.setPhone_number(sc.nextLine());
                            break;
                        default:
                            System.out.println("Enter valid choice");
                    }

                    System.out.println("Press 0 to edit more details or 1 to exit");
                    exit = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        if (fonud.equals("no")) {
            System.out.println("Contact not found");
        }
    }
}
