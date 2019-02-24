package PointsInTheCircle;

public class PointsCircle {

    private static final int POINTZERO = 1;
    private static final int NUMBEROFQUATER = 4;


    public static int pointsNumber(int radius)
    {
        int numberOfPoints = 0;
        for(int i = 1; i < radius; i++) {
            for (int j = 1; j < radius; j++) {
                if (Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2)) <= radius) {
                    numberOfPoints++;
                }
            }
        }
        numberOfPoints *= NUMBEROFQUATER;
        numberOfPoints += POINTZERO + NUMBEROFQUATER * radius;

        return numberOfPoints;
    }
}
