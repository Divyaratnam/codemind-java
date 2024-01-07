import java.util.*;
public class Bridge{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int y=read.nextInt();
        int z=read.nextInt();
        System.out.printf("%d",(z-y)/x);
    }
}