import java.util.*;
public class Integer{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int s=read.nextInt();
        System.out.printf("H:M:S-%d:%d:%d",s/3600,(s%3600)/60,(s%3600)%60);
    }
}