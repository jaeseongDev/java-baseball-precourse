package baseball;

import java.util.ArrayList;
import java.util.List;
import utils.RandomUtils;

public class Computer {
    private static final int START_NUMBER_IN_RANGE = 1;
    private static final int END_NUMBER_IN_RANGE = 9;
    private List<Integer> randomNumbers = new ArrayList<>();

    public Computer() {
        setRandomNumbers();
    }

    // 1에서 9까지 서로 다른 임의의 수 3개를 생성
    public List<Integer> getRandomNumbers() {
        return new ArrayList<>(randomNumbers);
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
