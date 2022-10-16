package org.secondSubtask;

import org.MyInput;

public class Person {

    String name, secondName, surname;

    public Person() {
        name = MyInput.inputString("Input name:", v -> v);
        secondName = MyInput.inputString("Input second name:", v -> v);
        surname = MyInput.inputString("Input surname:", v -> v);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
