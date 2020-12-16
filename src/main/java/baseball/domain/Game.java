package baseball.domain;

import baseball.domain.ball.Ball;
import baseball.domain.ball.Balls;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.StringUtils;

public class Game {

    public void start(Scanner scanner)  {
        try {
            Computer computer = new Computer();
            Balls inputBalls;
            do {
                inputBalls = getInputBalls(scanner);
                int strikeCount = computer.countStrike(inputBalls);
                int ballCount = computer.countBall(inputBalls);
                OutputView.printStrikeAndBallCount(strikeCount, ballCount);
            } while (!computer.isCorrectAnswer(inputBalls));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            start(scanner);
        }
    }

    private Balls getInputBalls(Scanner scanner) {
        try {
            String input = InputView.inputNumbers(scanner);
            String[] numbers = input.split("");
            List<Integer> convertedNumbers = StringUtils.toInts(numbers);
            List<Ball> balls = new ArrayList<>();
            for (int number : convertedNumbers) {
                balls.add(new Ball(number));
            }
            return new Balls(balls);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getInputBalls(scanner);
        }
    }
}
