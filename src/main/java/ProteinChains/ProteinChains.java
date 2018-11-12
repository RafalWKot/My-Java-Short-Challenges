package ProteinChains;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProteinChains {

    private final List<String> chains;

    public ProteinChains(String fileName) {
        this.chains = readFile(fileName);
    }

    public void chackAllFile() {
        int i = 0;
        while (chains.size() > i + 1) {
            System.out.print("Chain " + (i + 1) + " and Chain " + (i + 2) + " are ");
            if (changePossible(chains.get(i), chains.get(i + 1))) {
                System.out.println("possible.");
            } else {
                System.out.println("not possible");
            }
            i += 2;
        }
    }

    private boolean changePossible(String s1, String s2) {
        char[] s1Chars = sortCharsToArray(s1);
        char[] s2Chars = sortCharsToArray(s2);
        return Arrays.equals(s1Chars, s2Chars);
    }

    private List<String> readFile(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(getFile(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> chains = new ArrayList<>();
        while (scanner.hasNext()) {
            chains.add(scanner.nextLine());
        }
        return chains;
    }

    private File getFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(fileName).getFile());
    }

    private char[] sortCharsToArray(String string) {
        int asciiStartValue = 65;
        int quantityCharsInChain = 20;
        char[] chars = new char[quantityCharsInChain];
        for (int i = 0; i < string.length(); i++) {
            chars[string.codePointAt(i) - asciiStartValue] += 1;
        }
        return chars;
    }

}
