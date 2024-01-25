import java.util.*;
public class Operation{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        System.out.printf("Sum:%d
",a+b);
        System.out.printf("Difference:%d
",a-b);
        System.out.printf("Product:%d
",a*b);
        System.out.printf("Quotient:%d
",a/b);
        System.out.printf("Remainder:%d
",a%b);
    }
}