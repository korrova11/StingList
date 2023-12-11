package pro.sky.java.course2;

public interface StringList {
    String add(String item);

    String add(int index, String item);

    String set(int index, String item);

    String remove(String item);

    String remove(int index);

    boolean contains(String item);

    int indexOf(String item);

    int lastIndexOf(String item);

    String get(int index);


    int size();

    boolean isEmpty();

    void clear();

    String[] toArray();

    boolean equals(Object o);

    int hashCode();
}
