import java.util.Scanner;

// UC 2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactInput contactInputObj = new ContactInput();

        System.out.println("Welcome to addressbook");
        contactInputObj.addContact();
    }
}