package DashatizeIt;

public class DashatizeIt {
    public static String dashatize(int num) {

        long numLog = (long) num;
        int[] digits = Long.toString(Math.abs(numLog))
                .chars()
                .map(c -> c - '0')
                .toArray();

        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < digits.length; i++) {

            if (digits[i] % 2 == 1 && digits.length > 1) {
                if (i == 0) {
                    stringBuilder.append(digits[i] + "-");
                }
                if (i > 0 && i < digits.length - 1) {
                    if (digits[i - 1] % 2 == 1) {
                        stringBuilder.append(digits[i] + "-");
                    } else {
                        stringBuilder.append("-" + digits[i] + "-");
                    }
                }
                if (i == digits.length - 1 && digits[i - 1] % 2 != 1) {
                    stringBuilder.append("-" + digits[i]);
                }
                if ((i == digits.length - 1 && digits[i - 1] % 2 == 1)) {
                    stringBuilder.append(digits[i]);
                }
            } else {
                stringBuilder.append(digits[i]);
            }
        }

        return stringBuilder.toString();
    }
}
