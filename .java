import java.util.Scanner;

public class NFibonacci {
    public static int Fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int result = Fibonacci(n);
        System.out.println("The term " + n + " in the Fibonacci series is " + result);
    }
