import java.util.*;
public class StudentRegistration{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t-->0){
            int n=read.nextInt();
            int m=read.nextInt();
            int k=read.nextInt();
            if(n<=m-k)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}