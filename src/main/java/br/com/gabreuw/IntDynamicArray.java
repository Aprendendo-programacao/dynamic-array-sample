package br.com.gabreuw;

import java.util.Arrays;

public class IntDynamicArray {
    private int[] array = new int[]{};
    private int count = 0;
    private int size = 0;

    public void add(int value) {
        array = Arrays.copyOf(array, ++size);
        array[count++] = value;
    }

    public void remove(int value) {
        if (size < 1) {
            throw new NegativeArraySizeException();
        }

        int index = Arrays.binarySearch(array, value);

        int[] temp = new int[--size];
        int tempCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }

            temp[tempCount++] = array[i];
        }

        array = temp;
    }

    public int[] getArray() {
        return array;
    }
}
