package pro.sky.java.course2;

import pro.sky.java.course2.exception.ListFillException;
import pro.sky.java.course2.exception.NotFoundElement;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Optional;

public class StringListImpl implements StringList {
    final String[] list;
    static int count = 0;

    public StringListImpl(int size) {
        this.list = new String[size];
    }

    @Override
    public String toString() {
        return
                "list=" + Arrays.toString(list);
    }

    public void ifNull(String str) {
        if (str == null) {
            throw new NullPointerException("Элемент пустой");

        }

    }

    public void ifBadIndex(int in) {
        if (in < 0 || in > (list.length - 1)) {
            throw new ArrayIndexOutOfBoundsException("индекс выходит за границы размера списка");
        }
    }

    @Override
    public String add(String item) {

        ifNull(item);
        if (list[list.length - 1] == null) {
            int i = 0;
            while (list[i] != null) {
                i++;
            }
            list[i] = item;
            count++;
            return item + " под индексом " + i;
        } else {
            String s2 = "Лист заполнен";
            return s2;
        }

    }

    @Override
    public String add(int index, String item) {
        ifBadIndex(index);
        ifNull(item);

        if (list[list.length - 1] == null) {
            count++;
            String temp = item;
            String temp1 = "";
            for (int i = index; i < list.length; i++) {
                temp1 = list[i];
                list[i] = temp;
                temp = temp1;
            }

            return list[index];
        } else {
            throw new ListFillException("лист заполнен");
        }
    }

    @Override
    public String set(int index, String item) {
        ifBadIndex(index);
        ifNull(item);
        list[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        int i;
        for (i = 0; i < count; i++) {
            if (list[i].equals(item)) break;
        }
        if (i == count) {
            throw new NotFoundElement("элемента нет в списке");
        } else {
            list[i] = null;
            while (i < list.length - 2) {
                list[i] = list[i + 1];
                list[i + 1] = null;
                i++;
            }
            count--;
            return item;
        /*int i = 0;
        while (!list[i].equals(item)) {
            i++;
        }
        if (i >= list.length) {
            throw new NotFoundElement("элемента нет в списке");
        } else {
            list[i] = null;
            while (i < list.length - 2) {
                list[i] = list[i + 1];
                list[i + 1] = null;
                i++;
            }
            count--;

            return item;
        }*/
        }
    }

    @Override
    public String remove(int index) {
        ifBadIndex(index);
        String temp = list[index];
        while (index < count) {
            list[index] = list[index + 1];
            index++;
        }
        count--;
        return temp;
    }


    @Override
    public boolean contains(String item) {
       /* int i = 0;
        while (i < count) {
            if (!list[i].equals(item))
                i++;
            else break;
        }
        if (i == count) return false;
        else return true;*/
        int i;
        for (i = 0; i < count; i++) {
            if (list[i].equals(item)) break;
        }
        if (i == count) return false;
        else return true;
    }

    @Override
    public int indexOf(String item) {
        ifNull(item);

        int i;
        for (i = 0; i < count; i++) {
            if (list[i].equals(item)) break;
        }
        if (i == count) return -1;
        else return i;

    }

    @Override
    public int lastIndexOf(String item) {
        int i = count - 1;
        for (i = count - 1; i > -1; i--) {
            if (list[i].equals(item)) break;
        }
        return i;

    }

    @Override
    public String get(int index) {
        if (index < 0 || index > (count - 1)) {
            throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом нет");
        } else
            return list[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) throw new ListFillException("значение списка null");
       // return Arrays.equals(list, otherList);
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (list[0] == null) return true;
        else
            return false;
    }

    @Override
    public void clear() {
        Arrays.fill(list,null);

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
