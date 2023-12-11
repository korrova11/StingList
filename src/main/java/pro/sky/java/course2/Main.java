package pro.sky.java.course2;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // StringList str1 = new StringListImpl(3);
        StringList str2 = new StringListImpl(4);


        System.out.println(str2.add("Первый элемент"));

        System.out.println(str2.add("Второй элемент"));

        System.out.println(str2.toArray());

    }
}