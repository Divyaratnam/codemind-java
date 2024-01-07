import java.util.*;
public class Climbing{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t!=0){
            int x=read.nextInt();
            int y=read.nextInt();
            int m=(x/y);
            if(m*y==x){
                System.out.printf("%d
",m);
            }
            else{
                System.out.printf("%d
",m+(x-m*y));
            }
            t--;
        }
    }
}