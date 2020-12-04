package ui;

import java.util.Scanner;

public class Input {
    public static String receiveNumbers(Scanner scanner) {
        Output.printRequestNumbers();
        return scanner.nextLine();
    }
}
