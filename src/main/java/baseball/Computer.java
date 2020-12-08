package baseball;

import ui.Output;

public class Computer {

    private static final int STRIKE_COUNT_FOR_WINNING_GAME = 3;
    private Balls randomNumbers = BallsFactory.createRandomBalls();

    public void printResult(Balls numbers) {
        int strikeCount = randomNumbers.countStrike(numbers);
        int ballCount = randomNumbers.countBall(numbers);
        Output.printResult(strikeCount, ballCount);
    }

    public boolean isCorrectNumbers(Balls balls) {
        int strikeCount = randomNumbers.countStrike(balls);
        if (strikeCount == STRIKE_COUNT_FOR_WINNING_GAME) {
            return true;
        }
        return false;
    }
}
