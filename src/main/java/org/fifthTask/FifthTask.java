package org.fifthTask;

import org.MyInput;

public class FifthTask {

    public static void main(String[] args) {

        PhoneQualifier phoneQualifier = new PhoneQualifier(MyInput.inputString("Input phone number:", v -> v));
    }
}
