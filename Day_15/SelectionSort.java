public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {68, 45, 98, 74, 56, 83};
        selectionSort(examScores);
        System.out.println("Sorted exam scores: ");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}