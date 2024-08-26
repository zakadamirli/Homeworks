package MentorDay25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    private Map<String, String> contacts;

    public ContactBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            System.out.println("Contact with the name \"" + name + "\" already exists. Updating the phone number.");
        }
        contacts.put(name, phoneNumber);
        System.out.println("Contact added successfully!");
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact \"" + name + "\" removed successfully.");
        } else {
            System.out.println("Contact \"" + name + "\" not found.");
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact \"" + name + "\" not found.");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the contact book.");
        } else {
            System.out.println("Contacts:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        while (true) {
            System.out.println("\nContact Book Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. Search for a contact by name");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    contactBook.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    String nameToSearch = scanner.nextLine();
                    contactBook.searchContact(nameToSearch);
                    break;
                case 4:
                    contactBook.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting the contact book.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
