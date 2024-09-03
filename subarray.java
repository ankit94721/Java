public class subarray{

   public static void suba(int arrays[]){
  int crrsum=0;
  int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<arrays.length;i++){
        int start=i;
    for(int j=i;j<arrays.length;j++){
        int end=j;
        crrsum=0;
    for(int k=start;k<=end;k++){
        
        crrsum+=+arrays[k];

    }
     System.out.println(crrsum);
     if(maxsum<crrsum){
        maxsum=crrsum;
     }
   }
    }
    System.out.println("max sum of subarrays "+maxsum);
   }
    public static void main(String args[]){
       int arrays[]={2,4,6,8,10};
       suba(arrays);
    }
}