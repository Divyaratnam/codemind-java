import java.util.*;
public class Profit{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        double cp=read.nextDouble();
        double sp=read.nextDouble();
        System.out.printf("%.2f",((sp-cp)/cp)*100);
    }
}