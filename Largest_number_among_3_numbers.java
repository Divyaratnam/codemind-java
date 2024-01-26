import java.util.*;
public class Largest{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n1=read.nextInt();
        int n2=read.nextInt();
        int n3=read.nextInt();
        if(n1>n2&n1>n3)
        System.out.print(n1);
        else if(n2>n3)
        System.out.print(n2);
        else
        System.out.print(n3);
    }
}