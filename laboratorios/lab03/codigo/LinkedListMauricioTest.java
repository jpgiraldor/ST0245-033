import static org.junit.jupiter.api.Assertions.*;

class LinkedListMauricioTest {

    @org.junit.jupiter.api.Test
    void insert() {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(5, 0);
        assertEquals(list.get(0), 5);
        list.insert(4, 0);
        assertEquals(list.get(0), 4);
        list.insert(3,list.size()-1);
        assertEquals(list.get(list.size()-1), 3);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        LinkedListMauricio list = new LinkedListMauricio();

        list.remove(0);
        assertEquals(list.get(0), 999999);

        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);


        assertTrue(list.contains(1));
        list.remove(0);
        assertFalse(list.contains(1));

        assertTrue(list.contains(5));
        list.remove(list.size()-1);
        assertFalse(list.contains(5));

    }

    @org.junit.jupiter.api.Test
    void contains() {

        LinkedListMauricio list = new LinkedListMauricio();

        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);

        assertTrue(list.contains(5));

    }
    
}