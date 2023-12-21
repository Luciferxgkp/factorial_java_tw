public class Factorial {
    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if(number < 0) return -1;
        if(number == 0 ) return 1;
        int fact = 1;
        for (int multiplier = 1; multiplier <= number; multiplier++) {
            fact *= multiplier;
        }

        return fact;
    }
}
