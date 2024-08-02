import java.util.Random;

public class Sources {

    static Integer[] generateIntArray(int opacity, int numberRange) {
        Random random = new Random();
        Integer[] arr = new Integer[opacity];
        for (int i = 0; i < opacity; i++) {
            arr[i] = random.nextInt(numberRange);
        }
        return arr;
    }
}
