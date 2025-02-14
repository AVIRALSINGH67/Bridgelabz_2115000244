public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {104, 102, 101, 106, 105, 103};
        insertionSort(employeeIDs);
        System.out.println("Sorted employee IDs: ");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}