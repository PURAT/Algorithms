package sorting;

import java.util.Arrays;

public class Merge {
    public static double[] sortingAscending(double[] array) {
        if (array.length < 2)
            return array;
        int m = array.length/2;
        double[] array1 = Arrays.copyOfRange(array, 0, m);
        double[] array2 = Arrays.copyOfRange(array, m, array.length);
        return merge(sortingAscending(array1), sortingAscending(array2));
    }

    private static double[] merge(double[] array1, double[] array2) {
        int n = array1.length + array2.length;
        double[] array = new double[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == array1.length) {
                array[i] = array2[i2++];
            }
            else if (i2 == array2.length) {
                array[i] = array1[i1++];
            }
            else {
                if (array1[i1] < array2[i2]) {
                    array[i] = array1[i1];
                    i1++;
                }
                else {
                    array[i] = array2[i2];
                    i2++;
                }
            }
        }
        return array;
    }
}