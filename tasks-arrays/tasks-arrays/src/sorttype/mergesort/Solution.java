package sorttype.mergesort;

import java.util.Arrays;

// Сортировка слиянием   - уть сводится к тому, что мы принимаем на вход массив с
// указанием начала и конца участка для сортировки. При начале сортировки — это
// начало и конец массива. Далее мы вычисляем delimiter — положение делителя.
// Если делитель может разделить на 2 части, значит вызываем рекурсивно сортировку
// для участков, на которые делитель разбил массив. Подготавливаем дополнительный
// буферный массив, в котором выделяем отсортированный участок. Далее устанавливаем
// курсор в начало сортируемого участка и начинаем идти по каждому элементу пустого
// массива, который мы подготовили, и заполняем его наименьшими элементами.
// Если элемент, на который указывает курсор меньше, чем элемент, на который указывает
// делитель — помещаем в буферный массив этот элемент и сдвигаем курсор.
// В противном случае помещаем в буферный массив элемент, на который указывает
// разделитель и сдвигаем разделитель. Как только разделитель уйдёт за границы
// сортируемого участка или мы заполним весь массив, указанный диапазон считается
// отсортированным.
//Сложность  O(n log n)
public class Solution {
        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        void merge(int arr[], int l, int m, int r)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            /* Create temp arrays */
            int L[] = new int[n1];
            int R[] = new int[n2];

            /*Copy data to temp arrays*/
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of L[] if any */
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            /* Copy remaining elements of R[] if any */
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using
        // merge()
        void sort(int arr[], int l, int r)
        {
            if (l < r) {
                // Find the middle point
                int m = l + (r - l) / 2;

                // Sort first and second halves
                sort(arr, l, m);
                sort(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        }

        /* A utility function to print array of size n */
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String args[])
        {
            int arr[] = { 12, 11, 13, 5, 6, 7 };

            System.out.println("Given Array");
            printArray(arr);

            Solution ob = new Solution();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("\nSorted array");
            printArray(arr);
        }
    }

/*
public static void mergeSort(int[] source, int left, int right) {
        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
}
public static void mergeSort(int[] source, int left, int right) {
        // Выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            // Мы используем delimeter чтобы указывать на элемент из правой части
            // Если delimeter > right, значит в правой части не осталось недобавленных элементов
            if (delimiter > right || source[cursor] > source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
}
 */
