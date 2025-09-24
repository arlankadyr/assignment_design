package algo;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите алгоритм:");
        System.out.println("1 - MergeSort");
        System.out.println("2 - QuickSort");
        System.out.println("3 - Deterministic Select (k-й минимум)");
        System.out.println("4 - Closest Pair of Points");
        System.out.print("Ваш выбор: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Введите размер массива: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

                MergeSort.sort(arr);
                System.out.println("Отсортированный массив: " + Arrays.toString(arr));
                break;
            }
            case 2: {
                System.out.print("Введите размер массива: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

                QuickSort.sort(arr);
                System.out.println("Отсортированный массив: " + Arrays.toString(arr));
                break;
            }
            case 3: {
                System.out.print("Введите размер массива: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

                System.out.print("Введите k (0-based индекс): ");
                int k = sc.nextInt();

                int result = DeterministicSelect.select(arr, k);
                System.out.println(k + "-й наименьший элемент = " + result);
                break;
            }
            case 4: {
                System.out.print("Введите количество точек: ");
                int n = sc.nextInt();
                ClosestPair.Point[] points = new ClosestPair.Point[n];
                System.out.println("Введите точки (x y):");
                for (int i = 0; i < n; i++) {
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    points[i] = new ClosestPair.Point(x, y);
                }

                double dist = ClosestPair.findClosest(points);
                System.out.println("Минимальная дистанция = " + dist);
                break;
            }
            default:
                System.out.println("Неверный выбор!");
        }
    }
}
