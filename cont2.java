import java.util.*;
public class cont2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter your number");
            int m=sc.nextInt();
            if(m%10 == 0){
              continue;
            }
            System.out.println("the no is"+m);
        }while(true);
    }

    }


