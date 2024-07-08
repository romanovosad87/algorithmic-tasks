package day_16_0807;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f/solutions/java

public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }
        var wordsArray = words.split("\\s+");
        var orderedArray = new String[wordsArray.length];
        for (var word : wordsArray) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int position = Character.getNumericValue(c) - 1;
                    orderedArray[position] =  word;
                    break;
                }
            }
        }
        return String.join(" ", orderedArray);
    }
}
