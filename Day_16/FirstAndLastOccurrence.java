public class FirstAndLastOccurrence {
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[] {first, last};
    }

    private static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (arr[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    private static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (arr[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] result = findFirstAndLast(arr, 8);
        System.out.println("First Occurrence: " + result[0] + ", Last Occurrence: " + result[1]);
    }
}