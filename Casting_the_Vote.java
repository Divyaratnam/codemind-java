import java.util.*;
public class CastingVote{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        if(x>=18)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}