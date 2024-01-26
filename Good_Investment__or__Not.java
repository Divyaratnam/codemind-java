import java.util.*;
public class GoodInvestment{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int y=read.nextInt();
        if(x>=2*y)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}