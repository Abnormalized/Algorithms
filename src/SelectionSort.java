public class SelectionSort implements Algorithm {

    public void doAlgorithm(Integer[] array) {
        Integer[] sortedArray = new Integer[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            int min = findSmallestNumberIndex(array);
            sortedArray[i] = array[min];
            array[min] = null;
        }
    }

    static int findSmallestNumberIndex(Integer[] arr) {
        Integer min = arr[0];
        int smallestNumberIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && (min == null || arr[i] < min)) {
                min = arr[i];
                smallestNumberIndex = i;
            }
        }
        return smallestNumberIndex;
    }
}