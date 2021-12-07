import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X : ");
        a = sc.nextInt();
        System.out.print("Enter Y : ");
        b = sc.nextInt();
        System.out.println("X = "+a);
        System.out.println("Y = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping :");
        System.out.println("X = "+a);
        System.out.println("Y = "+b);
        sc.close();
    }
}
