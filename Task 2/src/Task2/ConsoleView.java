package Task2;

import java.util.Scanner;
class ConsoleView {

    private Scanner scanner;

    // Constructor to initialize the scanner.
    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    // Method to display information to the user.
    public void displayInfo(String info) {
        System.out.println(info);
    }

    // Method to gather input from the user.
    public String gatherInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}



