public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7 };
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
