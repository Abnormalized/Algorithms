package sort;

public class SelectionSort implements SortAlgorithm {

    public Integer[] sort(Integer[] array) {
        Integer[] sortedArray = new Integer[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            int min = findSmallestNumberIndex(array);
            sortedArray[i] = array[min];
            array[min] = null;
        }
        return sortedArray;
    }

    static int findSmallestNumberIndex(Integer[] array) {
        Integer min = array[0];
        int smallestNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && (min == null || array[i] < min)) {
                min = array[i];
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }
}