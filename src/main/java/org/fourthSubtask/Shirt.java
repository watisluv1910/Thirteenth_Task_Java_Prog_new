package org.fourthSubtask;

import java.util.StringTokenizer;

public class Shirt {

    String index, name, color, size;

    public Shirt(String data) {

        StringTokenizer tokenizer = new StringTokenizer(data, ",");

        index = tokenizer.nextToken();
        name = tokenizer.nextToken();
        color = tokenizer.nextToken();
        size = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "\nShirt {" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                "}";
    }
}
