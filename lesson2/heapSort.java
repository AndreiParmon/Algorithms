public class heapSort {
    public static void main(String[] args) {
        int[] array = new int[]{
                9,7,3,4,1,2,6,9,8,6,0,5
        };
        heapSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void heapSort(int[] array){
        int N = array.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(array, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int N, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && array[l] > array[largest])
            largest = l;

        if (r < N && array[r] > array[largest])
            largest = r;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, N, largest);
        }
    }
}
