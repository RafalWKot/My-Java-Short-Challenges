package Tribonacci;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            return new double[]{};
        }
        double[] newS = new double[n];
        for (int i = 0; i < n; i++) {
            if ( i <= 2) {
                newS[i] = s[i];
            } else {
                newS[i] = newS[i - 1] + newS[i -2] + newS[i - 3];
            }
        }
        return newS;
    }
}
