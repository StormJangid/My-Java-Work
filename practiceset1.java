import java.util.Scanner;

public class practiceset1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, mile;
        System.out.print("Enter Kilometers : ");
        km = sc.nextDouble();
        mile = 1.609 * km;
        System.out.println("Kilometers : " + km);
        String name = new String("Converting");
        System.out.println(name);
        System.out.print("Miles : " + mile);
        sc.close();

    }
}
