package sort;

import resurces.Sources;

import java.time.Duration;
import java.time.LocalTime;

public interface SortAlgorithm {

    default void doAnalyze(int opacity, int intValueRange) {
        Integer[] array = Sources.generateIntArray(opacity, intValueRange);
        System.out.print("Сортирую массив из " + array.length + " эллементов, методом " + this.getClass().getName() + ".");
        long start = System.currentTimeMillis();
        sort(array);
        System.out.format(" | Операция заняла: %f секундах \n", ((double) System.currentTimeMillis() - start) / 1000);
    }

    Integer[] sort(Integer[] array);

}
