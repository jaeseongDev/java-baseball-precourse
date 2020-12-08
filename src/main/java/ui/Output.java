package ui;

public class Output {

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
