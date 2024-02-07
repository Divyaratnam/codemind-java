import java.util.*;
public class DragonFruit{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        if(n%2==0&n!=2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}