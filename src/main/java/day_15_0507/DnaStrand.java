package day_15_0507;

// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

public class DnaStrand {

    public static String makeComplement(String dna) {
        StringBuilder builder = new StringBuilder();
        for (var w : dna.split("")) {
               var newLetter = switch (w) {
                   case "A" -> "T";
                   case "T" -> "A";
                   case "G" -> "C";
                   case "C" -> "G";
                   default -> w;
               };
               builder.append(newLetter);
        }
        return builder.toString();
    }
}
