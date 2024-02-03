import java.util.*;
public class OctalToBinary{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t-->0){
            int o=Integer.parseInt(read.next(),8);
            String b=Integer.toString(o,2);
            System.out.printf("%s
",b);
        }
    }
}