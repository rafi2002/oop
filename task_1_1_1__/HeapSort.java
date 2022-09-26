
import java.util.*;
import java.util.Arrays;

public class HeapSort {

    public void sort(int arrX[]) {
        int size = arrX.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arrX, size, i);
        for (int i=size-1; i>=0; i--) {
            int x = arrX[0];
            arrX[0] = arrX[i];
            arrX[i] = x;

            heapify(arrX, i, 0);
        }
    }


    void heapify(int arrA[], int heapSize, int i) {
        int largest = i;
        int left  = 2*i + 1;
        int right  = 2*i + 2;

        // If left is larger than the root
        if (left  < heapSize && arrA[left ] > arrA[largest])
            largest = left ;

        // If right is larger than the root
        if (right < heapSize && arrA[right ] > arrA[largest])
            largest = right ;

        // If largest is not root
        if (largest != i) {
            int swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;
            // calling
            heapify(arrA, heapSize, largest);
        }
    }

    public static void main(String args[]) {
        int arrA[] = {5,4,3,2,1};

        System.out.println(Arrays.toString(arrA));
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arrA);
        System.out.println(Arrays.toString(arrA));
    }
}