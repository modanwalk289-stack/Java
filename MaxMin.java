public class MaxMin {
    public static void main(String[] args) {
        
        int[] arr = {12,35,32,56,11};
        int max=arr[0],min=arr[0];

        for(int i = 0 ;i< arr.length;i++){
             if(arr[i]>max){
                max=arr[i];
             }
            

            
              if(arr[i]<min){
                min=arr[i];
             }
            }
        

        System.out.print("max = "+max +" min = "+min);
    }
    
}
