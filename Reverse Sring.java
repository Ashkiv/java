import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main (String[] args )
    {
        String str="Geeks ",nstr="";
        char ch ;
        System.out.println("Original Word:");
        System.out.printl("Geeks")//Example word

        for (int i=0;i<str.lenght();i++)
        {
            ch=str.charAt(i);//extracts each character
            nstr=ch+nstr;//adds each character at front of the existing string 
        } 
        System.out.println("Reversed Word :"+ nstr);

    }
}
