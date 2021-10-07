public class Main {
    public static void main(String[] args) {
        System.out.println(summa(101));
        System.out.println(numbers(14));
        recursion(4);
    }

    static int summa(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + summa(n / 10);
        }
    }

    static int numbers(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.println(n % 10 + " ");
            return numbers(n / 10);
        }
    }

    static void recursion(int n) {
        if (n > 1) recursion(n - 1);
        System.out.println(n);
    }
}