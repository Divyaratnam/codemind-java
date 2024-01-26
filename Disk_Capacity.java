import java.util.*;
public class DiskCapacity{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        int s=read.nextInt();
        int b=read.nextInt();
        System.out.printf("%d",2*t*s*b*512);
    }
}