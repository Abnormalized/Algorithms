package search;

import java.util.Objects;

public class BinarySearch implements SearchAlgorithm {

    @Override
    public Integer find(Integer[] array, Integer target) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int middle = first + (last - first) / 2;
            if (Objects.equals(array[middle], target)) {
                return middle;
            } else if (array[middle] < target) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return null;
    }
}
