package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
         int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // Calculate the sum of all digits
        int sum = thousands + hundreds + tens + units;

        System.out.println(sum);
    }
}
