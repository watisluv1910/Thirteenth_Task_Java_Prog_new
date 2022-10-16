package org.thirdSubtask;

import org.MyInput;

public class ThirdSubtask {

    public static void main(String[] args) {

        String address = MyInput.inputString("Input the address:", v -> v);

        Address myAddress = new Address(address);

        System.out.println(myAddress);
    }
}
