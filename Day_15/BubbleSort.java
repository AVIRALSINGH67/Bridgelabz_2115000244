public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {85, 97, 45, 63, 78, 58};
        bubbleSort(studentMarks);
        System.out.println("Sorted student marks: ");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}