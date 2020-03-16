package sorting;

public class Quick {
    public static void sortingAscdending(double[] array) {
        sortingAscending(array, 0, array.length - 1);
    }

    public static void sortingAscending(double[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        double pivot = array[(low + high) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            sortingAscending(array, 0, j);
        }

        if (high > i) {
            sortingAscending(array, i, high);
        }
    }
}
