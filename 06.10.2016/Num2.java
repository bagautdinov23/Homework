
public class Num2 {
    public static void main(String[] args) {
        int n;
        n = 10;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= (n - i); j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
                System.out.printf("%3d",fact(i) / (fact(j) * fact(i - j)));
            }
            System.out.println();
            System.out.println();
        }

    }

    public static int fact(int n) {
        int x = 1;
            for (int i = 1; i <= n; i++) {
                    x *= i;
                }
        return x;
    }
}
