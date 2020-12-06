package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ui.Input;
import ui.Output;

public class Game {
    private boolean isCorrectNumbers;

    public void start(Scanner scanner) {
        Computer computer = new Computer();
        do {
            Balls inputBalls = inputNumbersAndGetBalls(scanner);
            computer.printResult(inputBalls);
            isCorrectNumbers = computer.isCorrectNumbers(inputBalls);
        } while (!isCorrectNumbers);
        Output.printToWinGame();
        inputIfRestartOrExitGame(scanner);
    }

    private Balls inputNumbersAndGetBalls(Scanner scanner) {
        try {
            return tryToInputNumbersAndGetBalls(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputNumbersAndGetBalls(scanner);
        }
    }

    private Balls tryToInputNumbersAndGetBalls(Scanner scanner) {
        String numbersInput = Input.receiveNumbers(scanner);
        String[] userInputArr = numbersInput.split("");
        List<Ball> numbers = new ArrayList<>();
        for (int i = 0; i < userInputArr.length; i++) {
            numbers.add(new Ball(userInputArr[i]));
        }
        return new Balls(numbers);
    }

    private void inputIfRestartOrExitGame(Scanner scanner) {
        String status = Input.receiveGameRestartOrExit(scanner);
        if (status.equals(GameStatus.RESTART.getStatus())) {
            start(scanner);
            return;
        }
        if (status.equals(GameStatus.EXIT.getStatus())) {
            return;
        }
        throw new IllegalArgumentException(ErrorMessage.SHOULD_INPUT_CORRECT_VALUE);
    }
}
