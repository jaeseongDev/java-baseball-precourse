package ui;

public class Output {

    private static final String REQUEST_NUMBERS = "숫자를 입력해주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String WIN_GAME = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String ASK_TO_RESTART_OR_EXIT_GAME =
        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printRequestNumbers() {
        System.out.print(REQUEST_NUMBERS);
    }

    public static void printResult(int strikeCount, int ballCount) {
        if (strikeCount > 0 || ballCount > 0) {
            printBallAndStrikeCount(strikeCount, ballCount);
        }
        if (strikeCount == 0 && ballCount == 0) {
            printNothing();
        }
    }

    public static void printToWinGame() {
        System.out.println(WIN_GAME);
    }

    public static void printAskToRestartOrExitGame() {
        System.out.println(ASK_TO_RESTART_OR_EXIT_GAME);
    }

    private static void printBallAndStrikeCount(int strikeCount, int ballCount) {
        if (ballCount > 0) {
            System.out.print(ballCount + BALL + " ");
        }
        if (strikeCount > 0) {
            System.out.print(strikeCount + STRIKE);
        }
        System.out.println();
    }

    private static void printNothing() {
        System.out.println(NOTHING);
    }
}
