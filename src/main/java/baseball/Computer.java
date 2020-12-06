package baseball;

import java.util.ArrayList;
import java.util.List;
import ui.Output;
import utils.RandomUtils;

public class Computer {
    private static final int START_NUMBER_IN_RANGE = 1;
    private static final int END_NUMBER_IN_RANGE = 9;
    private Balls randomNumbers;

    public Computer() {
        setRandomNumbers();
        System.out.println(randomNumbers);
    }

    // 입력 값과 컴퓨터의 임의의 수 3자리 값과 비교 -> 힌트 출력
    public void printResult(Balls numbers) {
        int strikeCount = randomNumbers.countStrike(numbers);
        int ballCount = randomNumbers.countBall(numbers);
        Output.printResult(strikeCount, ballCount);
    }

    public boolean isCorrectNumbers(List<Ball> numbers) {
        for (int i = 0; i < randomNumbers.getBalls().size(); i++) {
            if (randomNumbers.getBalls().get(i) != numbers.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void setRandomNumbers() {
        List<Ball> randomNumbers = new ArrayList<>();
        // 숫자를 3개 생성할 때까지만 반복
        while (randomNumbers.size() != 3) {
            addRandomNumberTo(randomNumbers);
        }
        this.randomNumbers = new Balls(randomNumbers);
    }

    private void addRandomNumberTo(List<Ball> randomNumbers) {
        int randomNumber = RandomUtils.nextInt(START_NUMBER_IN_RANGE, END_NUMBER_IN_RANGE);
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(new Ball(randomNumber));
        }
    }
}
