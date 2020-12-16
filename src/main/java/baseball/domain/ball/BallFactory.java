package baseball.domain.ball;

import java.util.ArrayList;
import java.util.List;
import utils.RandomUtils;

public class BallFactory {
    private static final int VALID_BALLS_SIZE = 3;
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 9;

    public static Balls createRandomBalls() {
        List<Ball> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() != VALID_BALLS_SIZE) {
            int randomNumber = RandomUtils.nextInt(MIN_BALL_NUMBER, MAX_BALL_NUMBER);
            Ball randomBall = new Ball(randomNumber);
            if (!randomNumbers.contains(randomBall)) {
                randomNumbers.add(randomBall);
            }
        }
        // TODO 디버깅용
        System.out.println(randomNumbers);

        return new Balls(randomNumbers);
    }
}
