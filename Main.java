import java.util.Scanner;

// UC 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactInput contactInputObj = new ContactInput();

        System.out.println("Welcome to addressbook");
        boolean exit = false;

        while (!exit) {

            System.out.println("\nEnter choice: ");
            System.out.println("1. Add contact " + "\n2. Display Contact List " + "\n3. Edit"+"\n4. Delete Contact"+"\n5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contactInputObj.addContact();
                    break;

                case 2:
                    contactInputObj.displayContacts();
                    break;

                case 3:
                    contactInputObj.editContact();
                    break;

                case 4:
                    contactInputObj.deleteContact();
                    break;

                case 5:
                    System.out.println("Exiting....");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter valid option");
                    break;
            }
        }
    }
}