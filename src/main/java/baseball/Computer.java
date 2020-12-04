package baseball;

import java.util.ArrayList;
import java.util.List;
import utils.RandomUtils;

public class Computer {
    private static final int START_NUMBER_IN_RANGE = 1;
    private static final int END_NUMBER_IN_RANGE = 9;
    private List<Integer> randomNumbers = new ArrayList<>();

    // 1에서 9까지 서로 다른 임의의 수 3개를 생성
    public List<Integer> getRandomNumbers() {
        // 숫자를 3개 생성할 때까지만 반복
        while (randomNumbers.size() != 3) {
            addRandomNumber();
        }
        return randomNumbers;
    }

    private void addRandomNumber() {
        int randomNumber = RandomUtils.nextInt(START_NUMBER_IN_RANGE, END_NUMBER_IN_RANGE);

        // 중복된 값이 아닐 경우, 값 추가
        if (!randomNumbers.contains(randomNumber)) {
            randomNumbers.add(randomNumber);
        }
    }
}
