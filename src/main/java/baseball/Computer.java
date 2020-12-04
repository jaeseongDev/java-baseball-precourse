package baseball;

import java.util.ArrayList;
import java.util.List;
import ui.Output;
import utils.RandomUtils;

public class Computer {
    private static final int START_NUMBER_IN_RANGE = 1;
    private static final int END_NUMBER_IN_RANGE = 9;
    private List<Integer> randomNumbers = new ArrayList<>();

    public Computer() {
        setRandomNumbers();
    }

    // 입력 값과 컴퓨터의 임의의 수 3자리 값과 비교 -> 힌트 출력
    public void printResult(List<Integer> numbers) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int i = 0; i < randomNumbers.size(); i++) {
            // 스트라이크인 경우
            if (randomNumbers.get(i) == numbers.get(i)) {
                strikeCount += 1;
                continue;
            }

            // 볼인 경우
            if (randomNumbers.contains(numbers.get(i))) {
                ballCount += 1;
            }
        }
        Output.printStrikeCountAndBallCount(strikeCount, ballCount);
    }

    private void setRandomNumbers() {
        // 숫자를 3개 생성할 때까지만 반복
        while (randomNumbers.size() != 3) {
            addRandomNumber();
        }
    }

    private void addRandomNumber() {
        int randomNumber = RandomUtils.nextInt(START_NUMBER_IN_RANGE, END_NUMBER_IN_RANGE);
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }
}
