public class maxSubarray {
    public static void main(String[]args){
        int []arr = {-2,1,-3,4,-1,-5,4};

        int maxSum=0;
        int currentSum=0;

        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum=0;
            }
      
       else{
        maxSum=currentSum;
       }
    }
    System.out.println(maxSum);
    }
}
