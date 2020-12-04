package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ui.Input;

public class Game {
    private boolean isCorrectNumbers;

    public void start(Scanner scanner) {
        Computer computer = new Computer();

        do {
            // 3자리 수 입력받기
            String numbersInput = Input.receiveNumbers(scanner);
            // 3자리 수 배열로 만들기 -> 숫자로 변환 -> 리스트에 담기
            String[] userInputArr = numbersInput.split("");
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < userInputArr.length; i++) {
                numbers.add(Integer.parseInt(userInputArr[i]));
            }

            // 입력한 3자리 수에 대한 결과(힌트) 출력
            computer.printResult(numbers);
            isCorrectNumbers = computer.isCorrectNumbers(numbers);
            System.out.println(isCorrectNumbers);
        } while (!isCorrectNumbers);
    }
}
