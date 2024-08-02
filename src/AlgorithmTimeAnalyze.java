import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AlgorithmTimeAnalyze {
    public static void main(String[] args) {
        List<Algorithm> algorithmList = new ArrayList<>();
        algorithmList.add(new SelectionSort());

        for (Algorithm algorithm : algorithmList) {
            algorithm.doAnalyze(10000, 1000);
            algorithm.doAnalyze(20000, 1000);
            algorithm.doAnalyze(40000, 1000);
            algorithm.doAnalyze(80000, 1000);
        }
    }

}
