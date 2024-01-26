import java.util.*;
public class GrossSalary{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int s=read.nextInt();
        double gs;
        if(s<=10000){
            gs=((s*80)/100)+((s*20)/100)+s;
        }
        else if(s<=20000){
            gs=((s*90)/100)+((s*25)/100)+s;
        }
        else{
            gs=((s*95)/100)+((s*30)/100)+s;
        }
        System.out.printf("%.2f",gs);
    }
}