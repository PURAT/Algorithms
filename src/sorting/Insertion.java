package sorting;

public class Insertion {
    public static void sortingAscending(double[] array) {
        int j;
        double temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}
