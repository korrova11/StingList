package pro.sky.java.course2;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // StringList str1 = new StringListImpl(3);
        StringList str2 = new StringListImpl(4);


        System.out.println(str2.add("Первый элемент"));

        System.out.println(str2.add("Второй элемент"));

        StringList str= new StringListImpl(4);
        str.add("Первый элемент");
        str.add("Второй элемент");
        str.add("элемент");
        System.out.println(str.size());
        System.out.println(str2.size());


    }
}