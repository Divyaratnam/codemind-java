import java.util.*;
public class UpperOrLower{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        char c=read.next().charAt(0);
        if(c>='A' &c<='Z'){
            System.out.print("uppercase alphabet");
        }
        else if(c>='a'&c<='z'){
            System.out.print("lowercase alphabet");
        }
        else{
            System.out.print("not an alphabet");
        }
    }
}