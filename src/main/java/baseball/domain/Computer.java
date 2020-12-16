package baseball.domain;

import baseball.domain.ball.BallFactory;
import baseball.domain.ball.Balls;

public class Computer {
    private static final int FULL_STRIKE_COUNT = 3;
    private final Balls balls = BallFactory.createRandomBalls();

    public int countStrike(Balls inputBalls) {
        int strikeCount = 0;
        for (int i = 0; i < inputBalls.size(); i++) {
            if (inputBalls.get(i).equals(balls.get(i))) {
                strikeCount += 1;
            }
        }
        return strikeCount;
    }

    public int countBall(Balls inputBalls) {
        int ballCount = 0;
        for (int i = 0; i < inputBalls.size(); i++) {
            if (!inputBalls.get(i).equals(balls.get(i)) && balls.contains(inputBalls.get(i))) {
                ballCount += 1;
            }
        }
        return ballCount;
    }

    public boolean isCorrectAnswer(Balls inputBalls) {
        return countStrike(inputBalls) == FULL_STRIKE_COUNT;
    }
}
