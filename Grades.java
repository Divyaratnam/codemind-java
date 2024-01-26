import java.util.*;
public class Grades{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int p=read.nextInt();
        int c=read.nextInt();
        int b=read.nextInt();
        int m=read.nextInt();
        int com=read.nextInt();
        int sum=p+c+b+m+com;
        int per=(sum*100)/500;
        if(per>=90)
        System.out.print("Grade A");
        else if(per>=80)
        System.out.print("Grade B");
        else if(per>=70)
        System.out.print("Grade C");
        else if(per>=60)
        System.out.print("Grade D");
        else if(per>=40)
        System.out.print("Grade E");
        else
        System.out.print("Grade F");
    }
}