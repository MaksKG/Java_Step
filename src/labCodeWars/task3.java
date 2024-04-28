package labCodeWars;

public class BookNum {
    public static long pageDigits(long pages) {
        long digits = 0;
        long size = 1;
        long base = 1;

        while (true) {
            long nextBase = base * 10;
            if (pages >= nextBase) {
                digits += size * (nextBase - base);
                base = nextBase;
                size++;
            } else {
                digits += size * (pages - base + 1);
                break;
            }
        }

        return digits;
    }
}
