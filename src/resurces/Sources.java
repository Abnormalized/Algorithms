package resurces;

import sort.SelectionSort;
import sort.SortAlgorithm;

import java.util.Random;

public class Sources {

    static SortAlgorithm sortAlgorithm = new SelectionSort();

    public static Integer[] generateIntArray(int opacity, int numberRange) {
        Random random = new Random();
        Integer[] arr = new Integer[opacity];
        for (int i = 0; i < opacity; i++) {
            arr[i] = random.nextInt(numberRange);
        }
        return arr;
    }

    public static Integer[] generateSortedIntArray(int opacity, int numberRange) {
        Random random = new Random();
        Integer[] arr = new Integer[opacity];
        for (int i = 0; i < opacity; i++) {
            arr[i] = random.nextInt(numberRange);
        }
        return sortAlgorithm.sort(arr);
    }

    public static Integer generateRandomTarget(int numberRange) {
        Random random = new Random();
        return random.nextInt(numberRange);
    }
}
