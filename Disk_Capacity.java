import java.util.Scanner;
public class Disk{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c*512*2;
        System.out.println(d);
        
    }
}