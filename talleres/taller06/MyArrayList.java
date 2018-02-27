import java.awt.*;

public class MyArrayList <T> extends List{

    private T[] array;
    private final int DEAFAULT_SIZE = 10;
    private int size;

    public MyArrayList(){

        array = (T[]) new Object[DEAFAULT_SIZE];
        size = 0;
        // throw new IndexOutOfBoundsException();
    }
    public T get(int index) {
        if (index < size || index > 0) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Index : " + index);
    }

    public void addIndex(int index, T e) {
        if (index == 0) {
            array[index] = e;
            size++;
        }else if (index < size || index > 0) {

            for (int i = 0; i < size; i++) {
                if (i == size && size == array.length) {
                    extend();
                }

                if (i == index) {
                    T swap = array[i];
                    array[i] = e;
                    array[i + 1] = swap;
                    i++;
                    size++;
                }
            }
        }else if (index == size) {
            if (size == array.length) {
                extend();
                array[index] = e;
            }else {
                array[index] = e;
            }
        }
    }

    public void add(T e) {
        addIndex(size, e);
    }

    private void extend() {
        T[] array2 = (T[]) new Object[array.length + 10];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

}