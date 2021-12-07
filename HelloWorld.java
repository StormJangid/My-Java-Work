import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello I'm Here");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String name;
        name = sc.nextLine(); // for get full string
        System.out.print("Enter A : ");
        a = sc.nextInt();
        System.out.print("Enter B : ");
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
        // .next only for first word
        // System.out.printf("This is a string with printf : %s", name);
        // System.out.println();
        // System.out.format("This is a string with format : %s", name);
        // System.out.println();
        // System.out.println(name.length());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.strip());
        // System.out.println(name.trim());
        // System.out.println(name.replace("H", "G"));
        // System.out.println(name.substring(2));
        // System.out.println(name.substring(2, 5));
        // System.out.println(name.startsWith("He"));
        // System.out.println(name.endsWith("@gmail.com"));
        // System.out.println(name.hashCode());
        // System.out.println(name.split(" "));
        // System.out.println(name.indexOf("o"));
        System.out.println(name.charAt(3));
        sc.close();
        while(true){
            System.out.println("Hello I'm in loop");
        }

    }
}