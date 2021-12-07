import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        float total, sub1, sub2, sub3, sub4, sub5, per;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Marks of All Subjects : ");
        total = sc.nextFloat();
        System.out.print("Enter Marks of Subjects 1 : ");
        sub1 = sc.nextFloat();
        System.out.print("Enter Marks of Subjects 2 : ");
        sub2 = sc.nextFloat();
        System.out.print("Enter Marks of Subjects 3 : ");
        sub3 = sc.nextFloat();
        System.out.print("Enter Marks of Subjects 4 : ");
        sub4 = sc.nextFloat();
        System.out.print("Enter Marks of Subjects 5 : ");
        sub5 = sc.nextFloat();
        per = ((sub1 + sub2 + sub3 + sub4 + sub5) / total) * 100;
        System.out.print("Persentage is : " + per + "%");
        sc.close();

    }
}
