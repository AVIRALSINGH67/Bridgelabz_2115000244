import java.util.Arrays;

public class SortingComparison {

    public static void main(String[] args) {
        int[] dataset = generateDataset(10_000); 

        long bubbleSortTime = bubbleSort(Arrays.copyOf(dataset, dataset.length));
        long mergeSortTime = mergeSort(Arrays.copyOf(dataset, dataset.length));
        long quickSortTime = quickSort(Arrays.copyOf(dataset, dataset.length));

        System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
        System.out.println("Merge Sort Time: " + mergeSortTime + " ms");
        System.out.println("Quick Sort Time: " + quickSortTime + " ms");
    }

    private static int[] generateDataset(int size) {
        int[] dataset = new int[size];
        
        for (int i = 0; i < size; i++) {
            dataset[i] = (int)(Math.random() * size);
        }
        return dataset;
    }

    private static long bubbleSort(int[] dataset) {
        long startTime = System.currentTimeMillis();
        int n = dataset.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (dataset[j] > dataset[j+1]) {
                    int temp = dataset[j];
                    dataset[j] = dataset[j+1];
                    dataset[j+1] = temp;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long mergeSort(int[] dataset) {
        long startTime = System.currentTimeMillis();
        mergeSortHelper(dataset, new int[dataset.length], 0, dataset.length - 1);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static void mergeSortHelper(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSortHelper(array, temp, leftStart, middle);
        mergeSortHelper(array, temp, middle+1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    private static long quickSort(int[] dataset) {
        long startTime = System.currentTimeMillis();
        quickSortHelper(dataset, 0, dataset.length - 1);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSortHelper(array, low, pi-1);
            quickSortHelper(array, pi+1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}