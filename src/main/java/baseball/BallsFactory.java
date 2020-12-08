package baseball;

import java.util.ArrayList;
import java.util.List;
import utils.RandomUtils;

public class BallsFactory {
    private static final int START_NUMBER_IN_RANGE = 1;
    private static final int END_NUMBER_IN_RANGE = 9;

    public static Balls createBalls(String[] ballNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (String ballNumber : ballNumbers) {
            balls.add(new Ball(ballNumber));
        }
        return new Balls(balls);
    }

    public static Balls createRandomBalls() {
        List<Ball> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() != Balls.VALID_LENGTH_OF_BALLS) {
            addRandomNumberTo(randomNumbers);
        }
        return new Balls(randomNumbers);
    }

    private static void addRandomNumberTo(List<Ball> randomNumbers) {
        int randomNumber = RandomUtils.nextInt(START_NUMBER_IN_RANGE, END_NUMBER_IN_RANGE);
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(new Ball(randomNumber));
        }
    }
}
