package baseball.domain.ball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {
    private static final int BALLS_VALID_SIZE = 3;
    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        validateBallsSize(balls);
        validateOverlappedBall(balls);
        this.balls = new ArrayList<>(balls);
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    private void validateBallsSize(List<Ball> inputBalls) {
        if (inputBalls.size() != BALLS_VALID_SIZE) {
            throw new IllegalArgumentException("입력한 숫자가 3자리 수여야 한다.");
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

    public int size() {
        return balls.size();
    }

    public Ball get(int index) {
        return balls.get(index);
    }

    public boolean contains(Ball ball) {
        return balls.contains(ball);
    }
}
