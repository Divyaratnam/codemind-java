import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        double a=read.nextInt();
        double b=read.nextInt();
        double c=read.nextInt();
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}