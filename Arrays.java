import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] roll;
        int c, r;
        System.out.print("Enter How much classes Total : ");
        c = sc.nextInt();
        System.out.print("Enter How much Total Roll No in one classes : ");
        r = sc.nextInt();
        roll = new int[c][r];
        for (int i = 0; i < roll.length; i++) {
            for (int j = 0; j < roll[i].length; j++) {
                System.out.printf("Enter class %d Roll number %d : ", i + 1, j + 1);
                roll[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < roll.length; i++) {
            System.out.printf("Class %d Roll No : \n", i + 1);
            for (int j = 0; j < roll[i].length; j++) {
                System.out.print(roll[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
