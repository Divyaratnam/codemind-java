import java.util.*;
public class Print{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        char c=read.next().charAt(0);
        switch(c){
            case 'V':System.out.print("Violet");break;
            case 'I':System.out.print("Indigo");break;
            case 'B':System.out.print("Blue");break;
            case 'G':System.out.print("Green");break;
            case 'Y':System.out.print("Yellow");break;
            case 'O':System.out.print("Orange");break;
            case 'R':System.out.print("Red");break;
            default:System.out.print("-1");
        }
    }
}