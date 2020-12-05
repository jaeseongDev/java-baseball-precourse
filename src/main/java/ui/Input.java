package ui;

import baseball.ErrorMessage;
import java.util.Scanner;

public class Input {
    public static String receiveNumbers(Scanner scanner) {
        Output.printRequestNumbers();
        return scanner.nextLine();
    }

    public static void validateEmpty(String input) {
        if (input == "") {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_NOT_INPUT_EMPTY);
        }
    }
}
