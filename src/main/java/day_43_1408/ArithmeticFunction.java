package day_43_1408;

// https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> throw new IllegalArgumentException(
                    "%s operator is not supported".formatted(operator));
        };
    }
}
