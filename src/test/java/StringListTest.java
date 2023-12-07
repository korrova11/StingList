import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.StringList;
import pro.sky.java.course2.StringListImpl;
import pro.sky.java.course2.exception.ListFillException;
import pro.sky.java.course2.exception.NotFoundElement;

import static org.junit.jupiter.api.Assertions.*;

public class StringListTest {
    String STR1 = "STR1";
    String STR2 = "STR2";
    StringList out = new StringListImpl(4);
    StringList out1 = new StringListImpl(4);
    StringList out2 = new StringListImpl(5);


    @Test
    public void addTest() {
        out.add(STR1);
        assertTrue(out.contains(STR1));
        assertFalse(out.contains(STR2));
        assertThrows(NullPointerException.class, () -> out.add(null));
    }
    @Test
    public void addTestWhenFillList() {
        out.add(STR1);
        out.add(STR1);
        out.add(STR1);
        out.add(STR1);
        assertThrows(ListFillException.class, () -> out.add(STR2));
        assertThrows(ListFillException.class, () -> out.add(1,STR2));
    }

    @Test
    public void addByIndexTest() {
        out.add(0, STR1);
        assertTrue(out.contains(STR1));
        assertFalse(out.contains(STR2));
        assertThrows(NullPointerException.class, () -> out.add(0, null));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> out.add(-1, STR2));
    }

    @Test
    public void setTest() {
        out.add(0, STR1);
        out.set(0, STR2);
        assertTrue(out.contains(STR2));
        assertFalse(out.contains(STR1));
        assertThrows(NullPointerException.class, () -> out.set(0, null));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> out.set(-1, STR1));

    }
    @Test
    public void removeTest(){
        out.add(STR1);
        out.remove(STR1);
        assertFalse(out.contains(STR1));
        assertThrows(NotFoundElement.class,()->out.remove(STR2));

    }
    @Test
    public void removeByIndexTest(){
        out.add(0,STR1);
        out.remove(0);
        assertFalse(out.contains(STR1));
        assertThrows(NullPointerException.class,()->out.remove(2));

    }
    @Test
    public void containsTest(){
        out.add(STR1);
        assertTrue(out.contains(STR1));
        assertFalse(out.contains(STR2));

    }
    @Test
    public void indexOfTest(){
        out.add(STR1);

        assertTrue(out.indexOf(STR1)==0);
        assertTrue(out.indexOf(STR2)==-1);

    }
    @Test
    public void indexLastOfTest(){
        out.add(STR1);

        assertTrue(out.lastIndexOf(STR1)==0);
        assertTrue(out.lastIndexOf(STR2)==-1);

    }
    @Test
    public void getTest() {
        out.add(STR1);
        assertTrue(out.get(0).equals(STR1));
        assertFalse(out.get(0).equals(STR2));
        assertThrows(ArrayIndexOutOfBoundsException.class,()->out.get(-5));
        assertThrows(ArrayIndexOutOfBoundsException.class,()->out.get(1));

    }
    @Test
    public void equalsTest(){
        out.add(STR1);
        out.add(STR2);
        out1.add(STR1);
        out1.add(STR2);
        out2.add(STR1);
        out2.add(STR2);
        assertTrue(out.equals(out1));
        assertFalse(out.equals(out2));

    }
    @Test
    public void sizeTest(){
        out.add(STR1);
        out.add(STR2);
        assertTrue(out.size()==2);

    }
    @Test
    public void isEmptyTest(){
        assertTrue(out.isEmpty());
        out1.add(STR1);
        assertFalse(out1.isEmpty());
    }
    @Test
    public void clearTest(){
        out.add(STR1);
        out.add(STR2);
        out.clear();
        assertTrue(out.isEmpty());

    }
    @Test
    public void toArrayTest(){
       StringList str = out.toArray(3);
        assertTrue(str.isEmpty());
        str.add("щщ");
        assertFalse(str.isEmpty());

    }
    }
