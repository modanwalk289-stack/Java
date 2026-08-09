public class missing_no {
    public static void main(String[]args){
        int[] arr={1,2,3,4,6};
        int last = arr[arr.length-1];
        int sum=0,actual=0;
        for(int i=0;i<last;i++){
           actual=actual+i;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+i;
        }
        int missing=actual-sum;

        System.out.println("Missing Number = "+missing);
    }
    
}
