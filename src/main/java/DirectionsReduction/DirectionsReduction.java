package DirectionsReduction;

public class DirectionsReduction {

    public static String[] dirReduc(String[] array) {

        String[] reductionedDirection = new String[]{"NORTHSOUTH", "SOUTHNORTH", "EASTWEST", "WESTEAST"};
        String[] arrayToChange = array;
        boolean endCondition = true;

        while (endCondition) {
            endCondition = false;
            for (int i = 0; i < arrayToChange.length - 1; i++) {
                if (ifContain(arrayToChange[i], arrayToChange[i + 1], reductionedDirection)) {
                    arrayToChange = createNewArray(i, i + 1, arrayToChange);
                    endCondition = true;
                    break;
                }
            }
        }

        return arrayToChange;
    }

    private static boolean ifContain(String firstDirection, String secondDirection, String[] arrayOfReductionDirection) {

        for (String direction : arrayOfReductionDirection) {
            if (direction.equals(firstDirection + secondDirection)) {
                return true;
            }
        }
        return false;
    }

    private static String[] createNewArray(int firstIndexOut, int secondIndexOut, String[] arrayToChange) {

        String[] newArray = new String[arrayToChange.length - 2];
        int newArrayIndex = 0;
        for (int i = 0; i < arrayToChange.length; i++) {
            if (i != firstIndexOut && i != secondIndexOut) {
                newArray[newArrayIndex] = arrayToChange[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }
}
