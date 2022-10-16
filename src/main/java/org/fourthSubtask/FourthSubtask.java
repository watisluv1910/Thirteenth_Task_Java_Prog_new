package org.fourthSubtask;

import java.util.ArrayList;

public class FourthSubtask {

    public static void main(String[] args) {

        ArrayList<String> shirtsData = new ArrayList<String>() {
            {
                add("S001,Black Polo Shirt,Black,XL");
                add("S002,Black Polo Shirt,Black,L");
                add("S003,Blue Polo Shirt,Blue,XL");
                add("S004,Blue Polo Shirt,Blue,M");
                add("S005,Tan Polo Shirt,Tan,XL");
                add("S006,Black T-Shirt,Black,XL");
                add("S007,White T-Shirt,White,XL");
                add("S008,White T-Shirt,White,L");
                add("S009,Green T-Shirt,Green,S");
                add("S010,Orange T-Shirt,Orange,S");
                add("S011,Maroon Polo Shirt,Maroon,S");
            }
        };
        
        ArrayList<Shirt> shirts = new ArrayList<>();

        for (String shirtData : shirtsData) {
            shirts.add(new Shirt(shirtData));
        }

        System.out.println("ArrayList<Shirts>:" + shirts);
    }
}
