import java.util.*;
public class Digits{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int y=read.nextInt();
        System.out.printf("%02d",y%100);
    }
}