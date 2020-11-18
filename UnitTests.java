import org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UnitTests {

    // Unit testing for list size
    @Test
    public void getSizeOfList() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        // Inicialización/escenario
        List<Integer> list = null;

        // ¿qué es lo que queremos probar?
        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());

        list.remove(1);

        // ¿qué es lo que queremos probar?
        assertEquals(3, list.size());
    }

    // Unit testing for clearing the list
    @Test
    public void getSizeOfListClear() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test (expected = NullPointerException.class)
    public void clearNullList() {
        List<Integer> testList = null;
        testList.clear();
    }

    @Test
    public void  clearList(){
        List<Integer> testList = new ArrayList<>();
        testList.clear();
        assertEquals(0, testList.size());
    }


    // ---------------- We need to add Items -----------------

    @Test
    public void addItemsMultipleSize() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        assertEquals(2,testList.size());
        testList.add(2);
        assertEquals(3,testList.size());
    }

    @Test
    public void addMultipleItems() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        assertTrue(testList.contains(0));
        assertTrue(testList.contains(1));
        assertTrue(testList.contains(2));
        assertTrue(testList.contains(3));
    }

    @Test
    public void addSameItemsList() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(0);
        testList.add(0);
        testList.add(0);
        assertTrue(testList.contains(0));
    }

    // ---- We need to be able to check if an item exists ----
    @Test
    public void itemDoesNotExist() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        assertFalse(testList.contains(2));

    }

    @Test
    public void ContainsEmptyList() {
        List<Integer> testList = new ArrayList<>();
        assertFalse(testList.contains(0));
    }

    @Test (expected = NullPointerException.class)
    public void ContainsNullList() {
        List<Integer> testList = null;
        testList.contains(0);
    }

    // ---------- We need to get elements by index -----------
    @Test
    public void getElementByIndex() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        assertEquals(1,testList.get(1).intValue());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getElementbyIndexOutOfBoundsEx() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.get(3);
    }


    // ------ We need to search the index of an object -------
    @Test
    public void searchIndexObject() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        assertEquals(2,testList.indexOf(2));
    }

    @Test
    public void indexDisplacement() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.remove(0);
        assertEquals(1,testList.get(0).intValue());
    }

    @Test
    public void searchIndexDisplacement() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);

        testList.remove(1);

        assertEquals(1,testList.indexOf(2));
    }

    @Test (expected = NullPointerException.class)
    public void searchIndexNull() {
        List<Integer> testList = null;
        testList.indexOf(2);
    }

    @Test (expected = NullPointerException.class)
    public void removeItemNullList() {
        List<Integer> testList = null;
        testList.remove(1);
    }

    // --------- We need to remove an item by index ----------

    @Test
    public void removeItemByIndex() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);

        testList.remove(1);
        assertEquals(2,testList.size());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeIndexOutOfBounds() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.remove(4);
    }

    @Test
    public void removeItemIndexNull(){
        List<Integer> testList = new ArrayList<>();
        testList.add(null);
        testList.remove(null);
        assertEquals(0,testList.size());
    }

}
