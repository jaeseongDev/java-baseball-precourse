package ui;

import baseball.Ball;
import baseball.Balls;
import baseball.ErrorMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    public static Balls getBalls(Scanner scanner) {
        try {
            System.out.print("숫자를 입력해주세요 : ");
            String input = scanner.nextLine();
            String[] splitedInput = input.split("");
            List<Ball> balls = new ArrayList<>();
            for (String element : splitedInput) {
                balls.add(new Ball(element));
            }
            return new Balls(balls);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getBalls(scanner);
        }
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
