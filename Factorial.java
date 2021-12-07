import java.util.Scanner;

public class Factorial {
    public static int fact(int x) {
        int n = 1;
        for (int i = 1; i <= x; i++) {
            n = n * i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int c = sc.nextInt();
        int d = fact(c);
        System.out.println(d);
        sc.close();
    }
}
