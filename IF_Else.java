import java.util.Scanner;

public class IF_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        if (age < 18 && age > 0) {
            System.out.printf("You are not eligible for licence!");
        } else if (age >= 18 && age < 100) {
            System.out.printf("You are eligible for licence!");
        } else {
            System.out.println("Please Enter real Age or Try Again Later!");
        }
        sc.close();
    }
}
