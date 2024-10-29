import java.util.Scanner;
import java.util.List;

public class UserView {
    private Scanner scanner;
    private UserViewModel userViewModel;

    public UserView(UserViewModel userViewModel) {
        this.userViewModel = userViewModel;
        scanner = new Scanner(System.in);
    }

    public void runApp() {
        while (true) {
            int option = showMenu();
            switch (option) {
                case 1:
                    String name = getUserName();
                    userViewModel.addUser(name);
                    showMessage("User added!");
                    break;
                case 2:
                    if (userViewModel.getUserCount() > 0) {
                        String[] users = userViewModel.getUserNames();
                        displayUsers(users);
                    } else {
                        showMessage("No users to display.");
                    }
                    break;
                case 3:
                    showMessage("Exiting...");
                    return;
                default:
                    showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public int showMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserName() {
        System.out.print("Enter user name: ");
        scanner.nextLine(); // Для корректного ввода строки после числа
        return scanner.nextLine();
    }

    public void displayUsers(String[] users) {
        System.out.println("User List:");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
