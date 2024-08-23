package day_47_2008;

// https://www.codewars.com/kata/5cb7baa989b1c50014a53333/train/java

import java.util.Set;
import java.util.TreeSet;

public class Kata {
    public static void main(String[] args) {
        char[][] tablet = new char[][]{{'T', 'E', 'N'},
                {'E', 'Y', 'E'},
                {'N', 'E', 'T'}};
        System.out.println(isSatorSquare(tablet));
    }

    // Brute force
    public static Boolean isSatorSquare(char[][] tablet) {
        Set<String> leftToWrite = new TreeSet<>();
        for (char[] chars : tablet) {
            StringBuilder builder = new StringBuilder();
            for (char aChar : chars) {
                builder.append(aChar);
            }
            leftToWrite.add(builder.toString());
        }

        Set<String> topToBottom = new TreeSet<>();
        for (int i = 0; i < tablet.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < tablet[i].length; j++) {
                builder.append(tablet[j][i]);
            }
            topToBottom.add(builder.toString());
        }

        Set<String> rightToLeft = new TreeSet<>();
        for (char[] chars : tablet) {
            StringBuilder builder = new StringBuilder();
            for (int j = chars.length - 1; j >= 0; j--) {
                builder.append(chars[j]);
            }
            rightToLeft.add(builder.toString());
        }

        Set<String> bottomToTop = new TreeSet<>();
        for (int i = tablet.length - 1; i >= 0; i--) {
            StringBuilder builder = new StringBuilder();
            for (int j = tablet[i].length - 1; j >= 0; j--) {
                builder.append(tablet[j][i]);
            }
            bottomToTop.add(builder.toString());
        }

        return leftToWrite.equals(topToBottom)
                && topToBottom.equals(rightToLeft)
                && rightToLeft.equals(bottomToTop);
    }

    // Elegant solution
    public static Boolean isSatorSquareElegant(char[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[n - 1 - i][n - 1 - j] || matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;

    }

}
