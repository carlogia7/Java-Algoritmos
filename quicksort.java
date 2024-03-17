import java.util.Arrays;

public class quicksort {
    public static int partition(int[] v, int p, int r) {
    int pivot = v[r];
    int i = p - 1;
    for (int j = p; j < r; j++) {
        if (v[j] < pivot) {
            i++;
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
    i++;
    int temp = v[i];
    v[i] = v[r];
    v[r] = temp;
    System.out.println(i);
    return i;
}

public static void quickSort(int[] v, int p, int r) {
    if (p < r) {
        int q = partition(v, p, r);
        quickSort(v, p, q - 1);
        quickSort(v, q + 1, r);
    }
}

public static void main(String[] args) {
    int[] array = {5, 2, 9, 1, 7, 6, 3, 10};
    quickSort(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
}

}
