package baseball;

public class ErrorMessage {

    private static final int START_NUMBER_IN_VALID_RANGE = 1;
    private static final int END_NUMBER_IN_VALID_RANGE = 9;

    public static final String SHOULD_NOT_INPUT_EMPTY = "빈 값을 넣으시면 안 됩니다.";
    public static final String SHOULD_INPUT_ONLY_NUMBER = "숫자만을 입력해야 합니다.";
    public static final String SHOULD_INPUT_VALID_RANGE_NUMBER =
        START_NUMBER_IN_VALID_RANGE + "에서 " + END_NUMBER_IN_VALID_RANGE + "의 숫자만 입력해야 합니다.";
}
