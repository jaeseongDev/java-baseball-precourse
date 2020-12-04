package ui;

public class Output {
    private static final String REQUEST_NUMBERS = "숫자를 입력해주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";

    public static void printRequestNumbers() {
        System.out.print(REQUEST_NUMBERS);
    }

    public static void printStrikeCountAndBallCount(int strikeCount, int ballCount) {
        if (ballCount > 0) {
            System.out.println(ballCount + BALL);
            System.out.print(" ");
        }
        if (strikeCount > 0) {
            System.out.print(strikeCount + STRIKE);
        }
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println(NOTHING);
        }
    }
}
