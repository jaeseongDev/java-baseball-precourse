package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
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

    private boolean isStrike(int index, Balls inputBalls) {
        return balls.get(index).equals(inputBalls.getBalls().get(index));
    }

    private boolean isBall(int index, Balls inputBalls) {
        return !(isStrike(index, inputBalls)) && balls.contains(inputBalls.getBalls().get(index));
    }
}
