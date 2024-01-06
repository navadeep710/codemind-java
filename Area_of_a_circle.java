import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = 3.14f*a;
        float c = b*a;
        System.out.printf("%.2f",c);
    }
}