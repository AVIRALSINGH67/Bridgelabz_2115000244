import java.util.Arrays;

public class SearchComparison {

    public static void main(String[] args) {
        int[] dataset = generateDataset(1_000_000);
        int target = 500_000; 

        long linearSearchTime = linearSearch(dataset, target);
        long binarySearchTime = binarySearch(dataset, target);

        System.out.println("Linear Search Time: " + linearSearchTime + " ns");
        System.out.println("Binary Search Time: " + binarySearchTime + " ns");
    }

    private static int[] generateDataset(int size) {
        int[] dataset = new int[size];
        for (int i = 0; i < size; i++) {
            dataset[i] = i;
        }
        return dataset;
    }

    private static long linearSearch(int[] dataset, int target) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == target) {
                break;
            }
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long binarySearch(int[] dataset, int target) {
        Arrays.sort(dataset); 
        long startTime = System.currentTimeMillis();
        Arrays.binarySearch(dataset, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}