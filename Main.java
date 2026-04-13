import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDAO userDao = new UserDAO();
        Scanner scanner = new Scanner(System.in);

	while (true) {
            System.out.println("\n=== USER MENU ===");
            System.out.println("1. Add User");
            System.out.println("2. View Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    userDao.addUser(name, email);
                    break;

                case 2:
                    userDao.getAllUsers();
                    break;

                case 3:
                    System.out.print("Enter user ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    userDao.updateUser(updateId, newName, newEmail);
                    break;

                case 4:
                    System.out.print("Enter user ID to delete: ");
                    int deleteId = scanner.nextInt();
                    userDao.deleteUser(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
	    
}
