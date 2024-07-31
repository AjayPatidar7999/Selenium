public class Fibonacci {

    // Method to generate Fibonacci sequence up to n terms
    public static int[] generateFibonacci(int n) {
        int[] fibSequence = new int[n];
        if (n > 0) fibSequence[0] = 0;
        if (n > 1) fibSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence;
    }

    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int[] fibSequence = generateFibonacci(n);

        // Print the Fibonacci sequence
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int num : fibSequence) {
            System.out.print(num + " ");
        }
    }
}
