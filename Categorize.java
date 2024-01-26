import java.util.*;
public class Categorize{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        double h=read.nextDouble();
        if(h<=150)
        System.out.print("Person is Dwarf.");
        else if(h>150 & h<=165)
        System.out.print("Person is average heighted.");
        else if(h>165 &h<=195)
        System.out.print("Person is taller.");
        else
        System.out.print("Abnormal height.");
    }
}