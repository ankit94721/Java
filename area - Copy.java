import java.util.*;

public class area{
    public static void main(String args[]){
        int radius;
        double area;

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of circle\n");
        radius=sc.nextInt();
        area=Math.PI*radius*radius;
        System.out.println("area of circle:"+area);
}
}