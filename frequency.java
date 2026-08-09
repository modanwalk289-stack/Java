public class frequency {
    public static void main(String[] args) {
        
        int[] arr={1,1,3,3,3,4,3,2,2,2,3};

int count=1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==-1){
                continue;
            }
       for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
            arr[j]=-1;
        }

       }
       System.out.println("Frequency of "+arr[i]+" = "+count);
        }

    }
    
}
