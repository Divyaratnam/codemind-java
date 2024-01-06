import java.util.*;
public class Monopoly{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t!=0){
            int r1=read.nextInt();
            int r2=read.nextInt();
            int r3=read.nextInt();
            if(r1+r2<r3){
                System.out.println("YES");
            }
            else if(r1+r3<r2){
                System.out.println("YES");
            }
            else if(r2+r3<r1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }        
    }
}