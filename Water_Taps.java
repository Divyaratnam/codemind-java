import java.util.*;
public class Tap{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int y=read.nextInt();
        System.out.print((x*y)/(x+y));
    }
}