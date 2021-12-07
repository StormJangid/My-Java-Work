import java.util.Scanner;

public class naturalsum {
    public static int sum(int x) {
        int n = 0;
        for (int i = 1; i <= x; i++) {
            n = n + i;
        }
        return n;
    }

    public static int recsum(int x) {
        if (x == 1) {
            return 1;
        }
        x = x + recsum(x - 1);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int c = sc.nextInt();
        int d = sum(c);
        int e = recsum(c);
        System.out.println(d);
        System.out.println(e);
        sc.close();
    }
}
