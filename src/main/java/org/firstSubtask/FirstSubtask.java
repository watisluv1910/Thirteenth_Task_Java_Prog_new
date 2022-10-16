package org.firstSubtask;

import org.MyInput;

public class FirstSubtask {

    public static void main(String[] args) {

        String str = MyInput.inputString("Input some string: ", v -> v);

        System.out.println("The last symbol of the entered string is: " + str.charAt(str.length() - 1));

        if (str.endsWith("!!!")) {
            System.out.println("Entered string ends with '!!!'");
        } else {
            System.out.println("Entered string doesn't end with '!!!'");
        }

        if (str.startsWith("I like")) {
            System.out.println("Entered string starts with 'I like'");
        } else {
            System.out.println("Entered string doesn't start with 'I like'");
        }

        if (str.contains("Java")) {
            System.out.println("Entered string contains 'Java'");
            System.out.println("'Java' substring position is: " + str.indexOf("Java"));
        } else {
            System.out.println("Entered string doesn't contain 'Java'");
        }

        if (str.contains("a")) {
            System.out.println("The string in which 'a' were replaced with 'o': " + str.replace('a', 'o'));
        }

        System.out.println("Entered string in uppercase: " + str.toUpperCase());
        System.out.println("Entered string in lowercase: " + str.toLowerCase());

        if (str.contains("Java")) {
            System.out.println("Entered string without 'Java': " + str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4));
        }
    }
}
