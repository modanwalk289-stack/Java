public class majorityElement {
    public static void main(String[] args) {
        int []arr={2,2,1,2,3,2,2};

        int count=0;
        int mid=arr.length/2;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                  count++;
                }
                
            }
             if(count>mid){
                    System.out.println(" "+arr[i]);
                    break;
                }

            
        }
       
    }
    
}
