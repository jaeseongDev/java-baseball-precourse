package ui;

import baseball.ErrorMessage;
import java.util.Scanner;

public class Input {

    public static String receiveNumbers(Scanner scanner) {
        Output.printRequestNumbers();
        return validateEmptyAndGetInput(scanner);
    }

    public static String receiveGameRestartOrExit(Scanner scanner) {
        Output.printAskToRestartOrExitGame();
        return validateEmptyAndGetInput(scanner);
    }

    private static String validateEmptyAndGetInput(Scanner scanner) {
        String input = scanner.nextLine();
        if (input == "") {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_NOT_INPUT_EMPTY);
        }
        return input;
    }
}
