package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        String result = (number & Integer.MIN_VALUE) == 0 ? "true" : "false";
        System.out.println(result);
    }
}
