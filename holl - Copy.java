public class holl{
    public static void hollow_rectangle(int n,int m){
        for(int i=1;i<=n;i++){
         
          for(int j=1;j<=m;j++){
            
            if(i==1 || i==n || j==1 || j==m){
                
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }

         }
         System.out.println();

    }
}
public static void main(String args[]){
    hollow_rectangle(4,5);
}
}