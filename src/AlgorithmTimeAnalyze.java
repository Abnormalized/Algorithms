import resurces.Sources;
import search.BinarySearch;
import search.SearchAlgorithm;
import sort.SelectionSort;
import sort.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmTimeAnalyze {
    public static void main(String[] args) throws InterruptedException {

        searchExamples();

    }

    public static void sortExamples() {
        List<SortAlgorithm> sortAlgorithmList = new ArrayList<>();
        sortAlgorithmList.add(new SelectionSort());

        for (SortAlgorithm algorithm : sortAlgorithmList) {
            algorithm.doAnalyze(10000, 1000);
            algorithm.doAnalyze(20000, 1000);
            algorithm.doAnalyze(40000, 1000);
            algorithm.doAnalyze(80000, 1000);
        }
    }

    public static void searchExamples() throws InterruptedException {
        Integer[] array = Sources.generateSortedIntArray(100000, 2000000);
        List<SearchAlgorithm> searchAlgorithmList = new ArrayList<>();
        searchAlgorithmList.add(new BinarySearch());

        for (SearchAlgorithm algorithm : searchAlgorithmList) {
            algorithm.doAnalyze(array, 2000000);
            algorithm.doAnalyze(array, 2000000);
            algorithm.doAnalyze(array, 2000000);
            algorithm.doAnalyze(array, 2000000);
        }
    }

}
