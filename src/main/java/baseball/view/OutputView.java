package baseball.view;

import baseball.domain.ball.Balls;

public class OutputView {
    private static final int NO_STRIKE = 0;
    private static final int NO_BALL = 0;

    public static void printStrikeAndBallCount(int strike, int ball) {
        if (strike == NO_STRIKE && ball == NO_BALL) {
            System.out.print("낫싱");
            return;
        }
        if (ball != NO_BALL) {
            System.out.print(ball + "볼 ");
        }
        if (strike != NO_STRIKE) {
            System.out.print(strike + "스트라이크");
        }
        printEmptyLine();
    }

    private static void printEmptyLine() {
        System.out.println();
    }

    public static void printCorrectAnswer() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
