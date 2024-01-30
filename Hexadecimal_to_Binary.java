import java.util.*;
public class Hex{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t-->0){
            int i=Integer.parseInt(read.next(),16);
            String b=Integer.toBinaryString(i);
            if((b.length())%4==0){
            System.out.print(b);
            }
            else{
                int k=(b.length())%4;
                for(int j=1;j<=4-k;j++){
                    System.out.print("0");
                }
                System.out.print(b);
            }
            System.out.print("
");
        }
    }
}