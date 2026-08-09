public class EvenOdd {
    public static void main(String[] args) {
        
        int[]arr={12,343,32,12,43,9};
        int even,odd;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even no = "+arr[i]);
            }
            else{
                System.out.println("Odd No = "+arr[i]);
            }
        }
    }
    
}
