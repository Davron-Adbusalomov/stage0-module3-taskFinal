package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num1=number%10;
        int num2 = (number-num1)%100;
        int num3 = number/100;
        int result = num1*100+num2*10+num3;

        System.out.println(result);
        
    }
}
