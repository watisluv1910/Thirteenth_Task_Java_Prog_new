package org.fifthTask;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneQualifier {

    public static  Pattern globalPattern, rusPattern;

    public PhoneQualifier(String number) {
        globalPattern = Pattern.compile("^\\+\\d{11,13}$");
        rusPattern = Pattern.compile("^8\\d{10}$");

        Matcher globalMatcher = globalPattern.matcher(number);
        Matcher rusMatcher = rusPattern.matcher(number);

        if (globalMatcher.find() || rusMatcher.find()) {

            number = new StringBuilder(number).insert(number.length() - 4, "-").toString();
            number = new StringBuilder(number).insert(number.length() - 8, "-").toString();

            if (rusMatcher.find()) {
                number = number.replaceFirst("8", "+7");
            }

            System.out.println("The correct number is: " + number);
        }
    }
}
