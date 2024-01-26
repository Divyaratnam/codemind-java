import java.util.*;
public class Tickets{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        if(x*4<=1000){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}