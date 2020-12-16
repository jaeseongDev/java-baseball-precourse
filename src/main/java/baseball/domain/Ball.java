package baseball.domain;

import java.util.Objects;

public class Ball {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private final int number;

    public Ball(int number) {
        validateNumberRange(number);
        this.number = number;
    }

    private void validateNumberRange(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("각 자리의 숫자가 1~9의 숫자로 이루어져야 합니다. (0이 들어가면 안 됩니다.)");
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
        Ball ball = (Ball) o;
        return number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
