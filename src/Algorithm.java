import java.time.Duration;
import java.time.LocalTime;

public interface Algorithm {

    default void doAnalyze(int opacity, int intValueRange) {
        Integer[] array = Sources.generateIntArray(opacity, intValueRange);
        System.out.print("Сортирую массив из " + array.length + " эллементов, методом " + this.getClass().getName() + ".");
        LocalTime start = LocalTime.now();
        doAlgorithm(array);
        LocalTime end = LocalTime.now();
        Duration duration = Duration.ofSeconds(end.getSecond() - start.getSecond());
        System.out.format(" | Операция заняла: %d секунд \n", duration.getSeconds());
    }

    void doAlgorithm(Integer[] array);

}
