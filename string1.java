import java.util.*;

public class string1{
    public static boolean ispalindrome(Strings str){

    }
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
         System.out.println();
    }
    public static void main(String args[]){
        char arr[]={'a', 'b', 'c', 'd'};
        String str="abcd";
        String str2=new String("xyz");

        //Strings are immutable
        String firstname="Yash";
        String middlename="Mukul";
        String lastname="Prabhat";

        String fullname=firstname+" "+middlename+" "+lastname;
        
        printletters(fullname);

        // String fullname="Tony Stark";
        // System.out.println(fullname.length());

        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
    }
}
