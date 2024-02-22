import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a%10;
        while(a>=10){
            a = a/10;
        }
        System.out.println(b+a);
    }
}