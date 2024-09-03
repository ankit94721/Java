import java.util.*;
public class dupliset{
    public static boolean duplisets(int nums[]){
        HashSet<Integer> Sets=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(Sets.contains(nums[i])){
                return true;
            }else{
                Sets.add(nums[i]);
            }
            
            }
            return false;
        }
    
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        System.out.println(duplisets(nums));
    }
}