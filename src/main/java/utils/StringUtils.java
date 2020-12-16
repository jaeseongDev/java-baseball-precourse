package utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static int toInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력하셔야 됩니다.");
        }
    }

    public static List<Integer> toInts(List<String> input) {
        try {
            List<Integer> result = new ArrayList<>();
            for (String str : input) {
                result.add(Integer.parseInt(str));
            }
            return result;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력하셔야 됩니다.");
        }
    }

    public static List<Integer> toInts(String[] input) {
        try {
            List<Integer> result = new ArrayList<>();
            for (String str : input) {
                result.add(Integer.parseInt(str));
            }
            return result;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력하셔야 됩니다.");
        }
    }
}
