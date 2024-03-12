public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int number : numbers) {
            System.out.print(number);
            if (number != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
