import java.util.*;
public class Gross{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        float s=read.nextFloat();
        float h=read.nextFloat();
        float d=read.nextFloat();
        System.out.printf("%.2f
%.2f",(12*s)/100,s+h+d+(12*s)/100);
    }
}