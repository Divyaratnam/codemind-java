import java.util.*;
public class ElectricityBill{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        String cId=read.nextLine();
        String name=read.nextLine();
        double noUnits=read.nextDouble();
        double cost;
        if(noUnits<=199)
        cost=noUnits*1.20;
        else if(noUnits<400)
        cost=noUnits*1.50;
        else if(noUnits<600)
        cost=noUnits*1.80;
        else cost=noUnits*2.00;
        if(cost>400){
            cost=cost+(cost*15/100);
        }
        else cost+=100;
        System.out.printf("%.2f",cost);
    }
}