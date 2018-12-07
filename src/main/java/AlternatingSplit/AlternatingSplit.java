//"This is a test!", 1 -> "hsi  etTi sats!"

package AlternatingSplit;

public class AlternatingSplit {

    public String encrypt(final String text, final int n) {

        String newText = text;

        for (int j = 0; j < n; j++) {
            StringBuilder firstPartStr = new StringBuilder();
            StringBuilder secondPartStr = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 == 1) {
                    firstPartStr.append(newText.charAt(i));
                } else {
                    secondPartStr.append(newText.charAt(i));
                }
            }
            newText = firstPartStr.append(secondPartStr).toString();
        }
        return newText;
    }

    public String decrypt(final String encryptedText, final int n) {

        String text = encryptedText;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < text.length() / 2; j++) {
                newStr.append(text.charAt((text.length() / 2)  + j));
                newStr.append(text.charAt((j)));
            }
            if (text.length() % 2 == 1) {
                newStr.append(text.charAt((text.length() - 1)));
            }
            text = newStr.toString();
            newStr.setLength(0);
        }

        return text;
    }
}
