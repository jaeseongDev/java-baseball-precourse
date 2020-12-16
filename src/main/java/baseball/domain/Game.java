package baseball.domain;

import baseball.view.InputView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.StringUtils;

public class Game {
    private static final int BALLS_VALID_SIZE = 3;
    public void start(Scanner scanner)  {
        try {
            getInputBalls(scanner);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            start(scanner);
        }
    }

    private List<Ball> getInputBalls(Scanner scanner) {
        try {
            String input = InputView.inputNumbers(scanner);
            validateInputBalls(input);
            String[] numbers = input.split("");
            List<Integer> convertedNumbers = StringUtils.toInts(numbers);
            List<Ball> balls = new ArrayList<>();
            for (int number : convertedNumbers) {
                balls.add(new Ball(number));
            }
            validateOverlappedBall(balls);
            return balls;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getInputBalls(scanner);
        }
    }

    private void validateInputBalls(String input) {
        if (input.length() != BALLS_VALID_SIZE) {
            throw new IllegalArgumentException("입력의 글자 수가 3자리 수여야 한다.");
        }
    }

    private void validateOverlappedBall(List<Ball> balls) {
        int notOverlappedBallsSize = (int) balls.stream()
            .distinct()
            .count();
        if (balls.size() != notOverlappedBallsSize) {
            throw new IllegalArgumentException("중복된 숫자가 들어가면 안 된다.");
        }
    }
}
