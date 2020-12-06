package baseball;

import java.util.Objects;

public class Ball {
    private int ball;

    public Ball(String ball) {
        validateValidRangeNumber(toInt(ball));
        this.ball = toInt(ball);
    }

    public Ball(int ball) {
        validateValidRangeNumber(ball);
        this.ball = ball;
    }

    private int toInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_INPUT_ONLY_NUMBER);
        }
    }

    private void validateValidRangeNumber(int number) {
        if (number <= 0 || number >= 10) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_INPUT_VALID_RANGE_NUMBER);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball1 = (Ball) o;
        return ball == ball1.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball);
    }
}
