import java.util.*;
public class array{
    public static int linearSearch(int numbs[],int key){
        for(int i=0;i<numbs.length;i++){
            if(numbs[i]==key){
                return i;
            }
        }
                return -1;
    }
    public static void main(String args[]){
        
         int numbs[]={2,4,6,8,10,12,14,16};
         int key=10;

         int index=linearSearch(numbs,key);
         if(index==-1){
            System.out.println("element not found");
         } else{
            System.out.println("key found at index: "+index);
         }
    }

    }
