import java.util.*;
public class CarChoice{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t-->0){
        double x1=read.nextDouble();
        double x2=read.nextDouble();
        double y1=read.nextDouble();
        double y2=read.nextDouble();
        if((x1/y1)>(x2/y2)) System.out.println(-1);
        else if((x1/y1)<(x2/y2))System.out.println(1);
        else System.out.println(0);
        }
    }
}