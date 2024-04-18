package lab4;

public class Main {
    public static void main(String[] args) {
        int[] arr = {30,12,65,12,-5,19,100,2634};
        System.out.println("Unsorted array:");
        printArray(arr);

        heapSort(arr);
        System.out.println("\nSorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Будуємо купу
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Витягуємо всі елементи
        for (int i = n - 1; i > 0; i--) {
            // Сунемо поточний корінь в кінець списку
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    // Збільшуємо піддерево
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }


        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}

