package demo;

public class SumService {
    public static int sum(int a, int b) {
        if (a <= 0) {
            throw new IllegalArgumentException("a must be positive");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b must be positive");
        }

        return a + b;
    }
}
