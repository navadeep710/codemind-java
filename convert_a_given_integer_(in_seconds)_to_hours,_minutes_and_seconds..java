import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 3600;
        int c = a % 3600;
        int d = c / 60;
        int e = c % 60;
        System.out.println("H:M:S-" + b + ":" + d + ":" + e);
        sc.close();
    }
}
