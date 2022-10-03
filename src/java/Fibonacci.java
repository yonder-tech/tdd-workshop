public class Fibonacci {
    public int calculate(int index) {
        if (index >= 2) {
            return calculate(index - 1) + calculate(index - 2);
        } else {
            return 1;
        }
    }
}
