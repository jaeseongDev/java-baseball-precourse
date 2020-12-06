package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Balls {
    public static final int VALID_LENGTH_OF_BALLS = 3;
    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        validateBallsLength(balls);
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    public int countBall(Balls inputBalls) {
        return (int) IntStream.range(0, balls.size())
            .filter(i -> isBall(i, inputBalls))
            .count();
    }

    public int countStrike(Balls inputBalls) {
        return (int) IntStream.range(0, balls.size())
            .filter(i -> isStrike(i, inputBalls))
            .count();
    }

    private void validateBallsLength(List<Ball> balls) {
        if (balls.size() != VALID_LENGTH_OF_BALLS) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_BE_VALID_LENGTH_OF_BALLS);
        }
    }

    private boolean isStrike(int index, Balls inputBalls) {
        return balls.get(index).equals(inputBalls.getBalls().get(index));
    }

    private boolean isBall(int index, Balls inputBalls) {
        return !(isStrike(index, inputBalls)) && balls.contains(inputBalls.getBalls().get(index));
    }
}
