package Algorithms.Search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class fibonacciSearch {
    public static void main(String[] args) {
        /*
         * Thuật toán Tìm kiếm Fibonacci là một kỹ thuật tìm kiếm sử dụng chuỗi
         * Fibonacci để xác định các khoảng thời gian tìm kiếm. Nó hoạt động trên các
         * mảng được sắp xếp và sử dụng cách tiếp cận chia và chinh phục để xác định vị
         * trí phần tử mục tiêu một cách hiệu quả. Dưới đây là các bước để xây dựng
         * thuật toán Fibonacci Search trong Java:
         *
         * 1. Xác định một phương thức gọi là fibonacciSearch lấy mảng được sắp xếp,
         * phần tử đích để tìm kiếm và kích thước của mảng làm tham số. Phương thức sẽ
         * trả về chỉ mục của phần tử đích nếu tìm thấy hoặc -1 nếu nó không có trong
         * mảng.
         *
         * 2. Khởi tạo hai số Fibonacci, fibM và fibMMinus1, sao cho chúng là các số
         * Fibonacci nhỏ nhất lớn hơn hoặc bằng kích thước của mảng. Đặt fibMMinus2
         * thành fibMMinus1 - fibMMinus2.
         *
         * 3. Khởi tạo một biến offset để theo dõi phạm vi bị loại bỏ từ phía trước của
         * mảng.
         *
         * 4. Trong khi kích thước của mảng còn lại lớn hơn 1, hãy thực hiện các bước
         * sau:
         *
         * - So sánh phần tử target với phần tử tại index (offset + fibMMinus2).
         * - Nếu phần tử đích bằng với phần tử tại chỉ mục hiện tại, hãy trả về chỉ mục.
         * - Nếu phần tử đích nhỏ hơn phần tử tại chỉ mục hiện tại, hãy loại bỏ các phần
         * tử từ chỉ mục hiện tại đến cuối mảng và đặt fibM thành fibMMinus2 và
         * fibMMinus1 thành fibMMinus1 - fibMMinus2.
         * - Nếu phần tử đích lớn hơn phần tử tại chỉ mục hiện tại, hãy loại bỏ các phần
         * tử từ đầu mảng đến chỉ mục hiện tại, cập nhật bù đắp bằng cách thêm chỉ mục
         * hiện tại, đặt fibM thành fibMMinus1 và fibMMinus1 thành fibMMinus2 và
         * fibMMinus2 thành fibMMinus1 - fibMMinus2.
         * 5. Nếu phần tử đích bằng phần tử còn lại trong mảng, hãy trả về chỉ mục.
         *
         * 6. Nếu không tìm thấy phần tử đích, hãy trả về -1.
         */

        int[] array;
        Random random = new Random();
        System.out.print(
                "Use random arrays (Otherwise enter data into the array, each value separated by a space) Y/N: ");
        try (Scanner anwsersInput = new Scanner(System.in)) {
            String anwsers = anwsersInput.nextLine();
            if (anwsers.equalsIgnoreCase("Y")) {
                int arrayLength = random.nextInt(50) + 50;
                array = new int[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = random.nextInt(10000);
                }
            } else {
                System.out.print("Enter in the array of natural numbers (each number is separated by 1 space): ");
                try (Scanner arrayInput = new Scanner(System.in)) {
                    String[] arrayProseccin = arrayInput.nextLine().replaceAll("\\s+", " ").split(" ");
                    array = new int[arrayProseccin.length];
                    for (int i = 0; i < arrayProseccin.length; i++) {
                        array[i] = Integer.parseInt(arrayProseccin[i]);
                    }
                }
            }
            mergeSort(array, 0, array.length - 1);
            System.out.print("Array Sorted: ");
            Arrays.stream(array).forEach(x -> System.out.print(x + " "));
            System.out.println();
            System.out.print("Enter the value to find in the array: ");
            try (Scanner targetInput = new Scanner(System.in)) {
                int target = targetInput.nextInt();
                int index = fibonacciSearch(array, target, array.length);
                if (index != 1)
                    System.out.println("Element found at index: " + index);
                else
                    System.out.println("Element not found");
            }
        }
    }

    private static void mergeSort(int[] array, int left, int right) {
        // TODO document why this method is empty
    }

    private static int fibonacciSearch(int[] array, int target, int size) {
        return -1;
    }
}
