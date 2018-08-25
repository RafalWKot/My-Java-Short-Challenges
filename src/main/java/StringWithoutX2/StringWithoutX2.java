package StringWithoutX2;// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
// and otherwise return the string unchanged. This is a little harder than it looks.
//        withoutX2("xHi") → "Hi"
//        withoutX2("Hxi") → "Hi"
//        withoutX2("Hi") → "Hi"

public class StringWithoutX2 {
    public String getStringWithoutX2(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            if (!((j == 0 || j == 1) && (str.charAt(j) == 'x'))) {
                newStr.append(str.charAt(j));
            }
        }
        return newStr.toString();
    }
}
