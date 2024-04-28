package labCodeWars;

import java.util.stream.IntStream;

public class Utility {
    public static IntStream generateFibonacciSequence() {
        return IntStream.iterate(0, i -> i + 1).map(i -> {
            if (i == 0 || i == 1) {
                return 1;
            } else {
                int a = 1, b = 1;
                for (int j = 2; j <= i; j++) {
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
                return b;
            }
        });
    }
}
