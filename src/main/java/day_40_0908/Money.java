package day_40_0908;

public class Money {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.01625,0.18,1200));
    }
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        if (principal == desired) {
            return 0;
        }

        int years = 0;
        while (principal < desired) {
            var principalAmount = principal * interest;
            principal = principal + principalAmount * (1 - tax);
            years++;
        }
        return years;
    }
}
