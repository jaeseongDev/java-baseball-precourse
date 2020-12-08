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
            Balls inputBalls = Input.getBalls(scanner);
            computer.printResult(inputBalls);
            isCorrectNumbers = computer.isCorrectNumbers(inputBalls);
        } while (!isCorrectNumbers);
        Output.printToWinGame();
        String status = Input.getGameStatus(scanner);
        if (status == GameStatus.RESTART.getStatus()) {
            start(scanner);
        }
    }
}
