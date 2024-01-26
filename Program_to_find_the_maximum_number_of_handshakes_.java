import java.util.*;
public class HandShakes{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        System.out.printf("%d",(n*(n-1))/2);
    }
}