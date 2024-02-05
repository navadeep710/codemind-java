import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a/365);
        int c = b*365;
        int d = a-c;
        int r = (d/7);
        System.out.println(b);
        System.out.println(r);
    }
}