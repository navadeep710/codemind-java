import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b;
        a=sc.nextFloat();
        b = sc.nextFloat();
        double c;
        c = Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",c);
    }
}