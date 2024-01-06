import java.util.*;
public class Loss{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        double cp=read.nextInt();
        double sp=read.nextInt();
        System.out.printf("%.2f",((cp-sp)/cp)*100);
    }
}