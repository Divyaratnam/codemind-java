import java.util.*;
public class ReachHome{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        if(x<3)
        System.out.print("LIGHT");
        else if(x>=3 & x<7)
        System.out.print("MODERATE");
        else
        System.out.print("HEAVY");
    }
}