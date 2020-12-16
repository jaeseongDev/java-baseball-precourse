package baseball.view;

import java.util.Scanner;

public class InputView {
    public static String inputNumbers(Scanner scanner) {
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }

}
