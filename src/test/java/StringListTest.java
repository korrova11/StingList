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

}
