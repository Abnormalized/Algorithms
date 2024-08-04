package search;

import resurces.Sources;


public interface SearchAlgorithm {

    default void doAnalyze(Integer[] sortedArray, Integer maxValue) throws InterruptedException {
        System.out.print("Веду поиск в массиве из " + sortedArray.length + " эллементов с разбросом " +
                maxValue + ", методом " + this.getClass().getName() + ".");
        long start = System.currentTimeMillis();
        find(sortedArray, Sources.generateRandomTarget(maxValue));
        System.out.format(" | Операция заняла: %f секундах \n", ((double) System.currentTimeMillis() - start) / 1000);
    }

    Integer find(Integer[] array, Integer target);
}
