import java.util.*;
public class Cars{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n1=read.nextInt();
        int n2=read.nextInt();
        int x=read.nextInt();
        if(n2>n1){
            int d1=x;
            int d2=0;
            int t=0;
            while(true){
                if(d2<=d1){
                    t+=1;
                    d2+=n2;
                    d1+=n1;
                }
                else{
                    break;
                }
            }
            System.out.print(t);
        }
        else{
            System.out.print("-1");
        }
    }
}