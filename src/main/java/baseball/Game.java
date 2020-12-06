package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ui.Input;

public class Game {
    private boolean isCorrectNumbers;

    public void start(Scanner scanner) {
        Computer computer = new Computer();
        do {
            Balls inputBalls = inputNumbersAndGetBalls(scanner);
            computer.printResult(inputBalls);
            isCorrectNumbers = computer.isCorrectNumbers(inputBalls);
        } while (!isCorrectNumbers);
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
        Input.validateEmpty(numbersInput);
        String[] userInputArr = numbersInput.split("");
        List<Ball> numbers = new ArrayList<>();
        for (int i = 0; i < userInputArr.length; i++) {
            numbers.add(new Ball(userInputArr[i]));
        }
        return new Balls(numbers);
    }
}
