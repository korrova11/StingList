package pro.sky.java.course2;

import java.util.Arrays;

import static pro.sky.java.course2.StringListImpl.count;

public class Main {
    public static void main(String[] args) {
       // StringList str1 = new StringListImpl(3);
        StringList str2 = new StringListImpl(5);

        System.out.println(str2.add("Первый элемент"));
        System.out.println(str2.add("Второй элемент"));

       System.out.println(str2.add("Третий элемент"));
       System.out.println(str2.add("Четвертый элемент"));
      // System.out.println(str2.remove(1));
       // System.out.println(str2.add(0,"Пятый элемент"));
        System.out.println( "фактическое количество элементов = "+count);
       // System.out.println(str2.size());
        System.out.println(str2.contains("Четвертый элемент"));
        System.out.println(str2.contains(" элемент"));
       // System.out.println(str2.add(null));


    }
}