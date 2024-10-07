package day_65_1309;

// https://www.codewars.com/kata/59377c53e66267c8f6000027/train/java

public class Kata {
    public static String alphabetWar(String fight){
        int left = 0;
        int right = 0;
        for (var let : fight.toCharArray()) {
            switch (let) {
                case 'w' -> left +=4;
                case 'p' -> left += 3;
                case 'b' -> left += 2;
                case 's' -> left += 1;
                case 'm' -> right += 4;
                case 'q' -> right += 3;
                case 'd' -> right += 2;
                case 'z' -> right += 1;
            }
        }

        if (left == right) {
            return "Let's fight again!";
        }

        return left > right ? "Left side wins!" :
                        "Right side wins!";
    }
}
