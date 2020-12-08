package ui;

public class Output {

    public static void printRequestNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
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
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printAskToRestartOrExitGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    private static void printBallAndStrikeCount(int strikeCount, int ballCount) {
        if (ballCount > 0) {
            System.out.print(ballCount + "볼 ");
        }
        if (strikeCount > 0) {
            System.out.print(strikeCount + "스트라이크");
        }
        System.out.println();
    }

    private static void printNothing() {
        System.out.println("낫싱");
    }
}
