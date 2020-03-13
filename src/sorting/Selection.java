package sorting;

public class Selection {
    public static void sortingAscending(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_i]) {
                    min_i = j;
                }
            }
            double tmp = array[i];
            array[i] = array[min_i];
            array[min_i] = tmp;
        }
    }
}
