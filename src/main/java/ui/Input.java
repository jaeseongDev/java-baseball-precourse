package ui;

import baseball.Balls;
import baseball.BallsFactory;
import baseball.ErrorMessage;
import baseball.GameStatus;
import java.util.Scanner;

public class Input {

    public static Balls getBalls(Scanner scanner) {
        try {
            System.out.print("숫자를 입력해주세요 : ");
            String numbers = scanner.nextLine();
            validateNullAndEmptyAndBlank(numbers);
            String[] numbersArr = numbers.split("");
            return BallsFactory.createBalls(numbersArr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getBalls(scanner);
        }
    }

    public static String getGameStatus(Scanner scanner) {
        try {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = scanner.nextLine();
            validateNullAndEmptyAndBlank(input);
            validateGameStatus(input);
            return input;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getGameStatus(scanner);
        }
    }

    private static void validateGameStatus(String status) {
        if (status.equals(GameStatus.RESTART.getStatus())) {
            return;
        }
        if (status.equals(GameStatus.EXIT.getStatus())) {
            return;
        }
        throw new IllegalArgumentException(ErrorMessage.SHOULD_INPUT_CORRECT_VALUE);
    }

    private static void validateNullAndEmptyAndBlank(String input) {
        if (input == null || "".equals(input.trim())) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_NOT_INPUT_BLANK);
        }
    }
}
