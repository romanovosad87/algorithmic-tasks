package day_28_2407;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = new String[]{"hello","hellob", "helloa"};
        var order = "ngxlkthsjuoqcpavbfdermiywz";
        System.out.println(solution.isAlienSorted(words, order));
        System.out.println(solution.isAlienSortedDummy(words, order));
    }

    public boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i < words.length - 1; i++) {
            if (!isInOrder(words[i], words[i + 1], order)) {
                return false;
            }
        }
        return true;
    }

    private boolean isInOrder(String word1, String word2, String order) {
        int length1 = word1.length();
        int length2 = word2.length();
        int length = Math.min(length1, length2);
        for (int i = 0; i < length; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if (c1 != c2) {
                return order.indexOf(c2) > order.indexOf(c1);
            }
        }
        return length2 >= length1;
    }

    // my dummy solution
    public boolean isAlienSortedDummy(String[] words, String order) {
        int wordPosition = 0;
        int pos = -1;
        int startCompareWords = 0;
        int endCompareWords = words.length;
        while (startCompareWords < endCompareWords) {
            int wordLength = 0;
            for (int i = startCompareWords; i < endCompareWords; i++) {
                if (words[i].length() > wordPosition) {
                    var c = words[i].charAt(wordPosition);
                    var index = order.indexOf(c);
                    if (index < pos) {
                        return false;
                    } else if (index > pos) {
                        if (i <= startCompareWords + 1) {
                            startCompareWords = i;
                        }

                        if (i >= endCompareWords - 1) {
                            endCompareWords = i;
                        }
                        pos = index;
                    }
                } else if (i != startCompareWords) {
                    return words[i].length() >= wordLength;
                }
                wordLength = words[i].length();
            }
            wordPosition++;
            pos = -1;
        }
        return true;
    }
}
