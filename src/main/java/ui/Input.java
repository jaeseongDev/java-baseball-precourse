package ui;

import baseball.ErrorMessage;
import java.util.Scanner;

public class Input {

    public static String receiveNumbers(Scanner scanner) {
        System.out.print("숫자를 입력해주세요 : ");
        return validateEmptyAndGetInput(scanner);
    }

    public static String receiveGameRestartOrExit(Scanner scanner) {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
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
