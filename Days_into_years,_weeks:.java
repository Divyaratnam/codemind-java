import java.util.*;
public class Days{
    public static void main(String[] args){
       Scanner read=new Scanner(System.in);
       int d=read.nextInt();
       System.out.printf("%d
",d/365);
       System.out.printf("%d
",(d%365)/7);
    }
}