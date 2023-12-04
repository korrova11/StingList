package pro.sky.java.course2;

import pro.sky.java.course2.exception.NotFoundElement;

import java.io.FileNotFoundException;

public class StringListImpl implements StringList{
    final String [] list;

    public StringListImpl(int size) {
        this.list = new String[size];
    }

    @Override
    public String add(String item) {
        if (item==null){
           throw new NullPointerException("Элемент пустой");

                    }
        if (list[list.length-1]==null){
            int i=0;
            while (list[i]!=null){i++;}
            list[i]=item;
            return item + " под индексом " + i;
        }
        else {
            String s2 = "Лист заполнен";
            return s2;
        }

    }

    @Override
    public String add(int index, String item) {
        if (index>(list.length-1)){
            throw new ArrayIndexOutOfBoundsException("индекс выходит за границы размера списка");
        }
        if (item==null){
            throw new NullPointerException("Элемент пустой");
        }
        list[index]=item;
                return list[index];
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        int i=0;
        while (!list[i].equals(item)){i++;}
        if (i == list.length) {
            throw new NotFoundElement("элемента нет в списке");
        }
        list[i]=null;
        return item;
    }

    @Override
    public String remove(int index) {

        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
