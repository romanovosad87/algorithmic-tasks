package day_29_2507;

// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/solutions/java

import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static void main(String[] args) {
        List<Integer> binary = List.of(1, 0, 0, 1);
        System.out.println(ConvertBinaryArrayToInt(binary));
        System.out.println(ConvertBinaryArrayToIntBitwiseOperations(binary));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        var strBinary = binary.stream()
                .map(i -> "" + i)
                .collect(Collectors.joining());

        return Integer.parseInt(strBinary, 2);
    }

    public static int ConvertBinaryArrayToIntBitwiseOperations(List<Integer> binary) {

        int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }
}
