import java.util.Scanner;

public class factwithrec {
    public static int fact(int x) {
        if (x == 1 || x == 0) {
            x = 1;
            return x;
        }
        x = x * fact(x - 1);
        return x;
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
