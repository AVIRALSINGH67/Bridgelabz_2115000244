public class CountingSort {
    public static void countingSort(int[] array) {
        int max = 18; 
        int min = 10; 
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 14, 13, 15, 11, 16, 12, 14};
        countingSort(studentAges);
        System.out.println("Sorted student ages: ");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}