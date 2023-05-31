import java.util.Scanner;

// UC 3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactInput contactInputObj = new ContactInput();

        System.out.println("Welcome to addressbook");
        boolean exit = false;

        while (!exit) {

            System.out.println("\nEnter choice: ");
            System.out.println("1. Add contact " + "\n2. Display Contact List " + "\n3. Exit");

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
                default:
                    System.out.println("Enter valid option");
                    break;
            }
        }
    }
}