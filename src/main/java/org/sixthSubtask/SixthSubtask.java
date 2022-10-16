package org.sixthSubtask;

import java.io.*;
import java.util.*;

public class SixthSubtask {

    public static void main(String[] args) throws Exception {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("D:" +
                                "\\IntelliJ IDEA source" +
                                "\\Java Programming MIREA" +
                                "\\Home task" +
                                "\\Task num.13" +
                                "\\src" +
                                "\\main" +
                                "\\resources" +
                                "\\sixth_subtask_test.txt" +
                                "\\"
                        )
                );

        ArrayList<String> wordsList = new ArrayList<>();
        while (reader.ready()) {

            wordsList.addAll(Arrays.asList(reader.readLine().split(" "))) ;
        }
        reader.close();

        System.out.println(getLine(wordsList));
    }

    public static StringBuilder getLine(ArrayList<String> words) {

        if (words == null || words.size() == 0) return new StringBuilder();

        if (words.size() == 1 || words.get(0).equals("")) {
            return new StringBuilder(words.get(0));
        }

        StringBuilder result = new StringBuilder();

        while (!findSequence(words)) Collections.shuffle(words);

        for (String word : words) result.append(word).append(" ");

        result.deleteCharAt(result.length() - 1);//удалили последний пробел
        return result;
    }

    public static boolean findSequence(ArrayList<String> words) {

        for (int i = 0; i < words.size() - 1; i++) {

            String firstWord = words.get(i).toLowerCase();
            String secondWord = words.get(i + 1).toLowerCase();

            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0))
                return false;
        }
        return true;
    }
}
