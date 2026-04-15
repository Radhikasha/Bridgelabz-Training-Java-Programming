import java.util.*;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate4DigitRandomArray(5);
        int[] arr = generate4DigitRandomArray(5);
        for (int num : arr) {
            System.out.println(num);
        }
        double[] avgMinMaX = findAverageMinMax(arr);
        System.out.println("Average: " + avgMinMaX[0]);
        System.out.println("Minimum: " + avgMinMaX[1]);
        System.out.println("Maximum: " + avgMinMaX[2]);

    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(9000) + 1000; // Generates a random 4-digit number
        }
        return arr;

    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }
}
