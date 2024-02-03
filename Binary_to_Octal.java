import java.util.*;
public class BinaryToOctal{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        while(t-->0){
            int b=Integer.parseInt(read.next(),2);
            String o=Integer.toString(b,8);
            System.out.printf("%s
",o);
        }
    }
}