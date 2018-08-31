//Given two strings, write a program that efficiently finds the longest common subsequence



package CommonSubsequence;

public class CommonSubsegeunce {

    public String getCommonSubseguence(String stringA, String stringB) {
        if (stringA.length() > stringB.length()) {
            return getString(stringA, stringB);
        } else {
            return getString(stringB, stringA);
        }
    }

    private String getString(String stringA, String stringB) {
        String newString = "";
        for (int i = 0; i < stringB.length() - 1; i++) {
            for(int j = i + 1; j < stringB.length(); j++) {
                if(stringA.contains(stringB.subSequence(i, j)) &&
                        stringB.subSequence(i, j).toString().length() > newString.length()) {
                    newString = stringB.subSequence(i, j).toString();
                }
            }
        }
        return newString;
    }
}
