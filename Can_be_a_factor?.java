import java.util.*;
public class Factor{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t-->0){
            int a=read.nextInt();
            int b=read.nextInt();
            int c=Math.abs(a-b);
            if(c>=a||a==b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}