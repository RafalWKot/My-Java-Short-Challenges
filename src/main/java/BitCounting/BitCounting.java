package BitCounting;

public class BitCounting {

    public int countBits(int n) {
        return (int)Integer.toBinaryString(n)
                .chars()
                .map(i -> Integer.valueOf(String.valueOf((char)i)))
                .filter(i -> i == 1)
                .count();
    }
}
