package baseball.domain;

import java.util.Arrays;

public enum Status {
    RESTART("1"),
    EXIT("2");

    private final String number;

    Status(String number) {
        this.number = number;
    }

    public static Status getStatusByNumber(String inputNumber) {
        return Arrays.stream(Status.values())
            .filter(status -> status.number.equals(inputNumber))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("1, 2 외의 값을 입력하면 안 됩니다."));
    }
}
