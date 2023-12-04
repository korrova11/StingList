package pro.sky.java.course2;

public class Main {
    public static void main(String[] args) {
        StringList str1 = new StringListImpl(2);
        System.out.println(str1.add("Первый элемент"));
        System.out.println(str1.add("Второй элемент"));
      //  System.out.println(str1.add(null));
     //   System.out.println(str1.add("Третий элемент"));
        System.out.println(str1.add(1,"Третий элемент"));
        System.out.println(str1.remove("Третий элемент"));
        System.out.println(str1.remove("Четвертый элемент"));


    }
}