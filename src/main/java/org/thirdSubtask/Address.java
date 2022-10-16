package org.thirdSubtask;

import java.util.StringTokenizer;

public class Address {

    String country, region, city, street, house, building, apartment;

    public Address(String address) {

        StringTokenizer tokenizer = new StringTokenizer(address, ",.; ");

        country = tokenizer.nextToken();
        region = tokenizer.nextToken();
        city = tokenizer.nextToken();
        street = tokenizer.nextToken();
        house = tokenizer.nextToken();
        building = tokenizer.nextToken();
        apartment = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Address {" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
