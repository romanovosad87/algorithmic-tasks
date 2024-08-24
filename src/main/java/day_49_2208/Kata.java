package day_49_2208;

// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

public class Kata {
    public static void main(String[] args) {
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Harry"));
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        var first = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
        var second = first == fighter1 ? fighter2 : fighter1;

        while(true) {
            if (health(first, second) <= 0) {
                return first.name;
            }
            if (health(second, first) <= 0) {
                return second.name;
            }
        }
    }

    private static int health(Fighter attacker, Fighter defender) {
        return defender.health -= attacker.damagePerAttack;
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
