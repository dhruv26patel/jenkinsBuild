public class BubbleSort {

    public void bubbleSort(int[] numbers) {
        boolean swapped = true;

        while (swapped) { // continue until there is no swap
            swapped = false;
            for (int k = 0; k < numbers.length - 1; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    swap(numbers, k);
                    swapped = true; // if there is at least one swap make swapped true
                }
            }
        }
    }

    private void swap(int[] numbers, int k) {
        int temp = numbers[k + 1];
        numbers[k + 1] = numbers[k];
        numbers[k] = temp;
    }
}