package sorting;

public class Bubble {
    public static void bubbleSortingAscending(double[] array) {
        for (int out = array.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    double tmp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = tmp;
                }
            }
        }
    }


}
