import java.util.*;
public class towdarray{
    public static int max(int matrix[][]){
        int min=Integer.MAX_VALUE;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                       min=matrix[i][j];
                }
                }
                
            }
             
              return min;
        }
       
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at loc("+i+","+j+" )");
                    return true;


                }
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;

        Scanner sc=new Scanner(System.in); 
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("largest element in matrix"+max(matrix));

    }
}

