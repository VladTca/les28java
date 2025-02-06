public class Main {
    public static void main(String[] args) {

        System.out.println(factorialRecursion(5));
        System.out.println(fibbonaciRecursion(5));

    }

    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursion(--n);
        }
    }

    public static int fibbonaciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibbonaciRecursion(n - 1) + fibbonaciRecursion(n - 2);
        }
    }
}