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
        return switch (n) {
            case 0 ->
                //return 0;     //если считать по нормальному нумерацию
                    1;    //если по компьютерному

            case 1 -> 1;
            default -> fibbonaciRecursion(n - 1) + fibbonaciRecursion(n - 2);
        };
    }
}