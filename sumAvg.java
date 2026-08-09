public class sumAvg {
    public static void main(String[] args) {
        int[]arr={10,20,30,40};
        int sum =0,avg=0;
        for (int i = 0;i<arr.length;i++){
             sum = sum+arr[i];
        }
        avg=sum/arr.length;
    

    System.out.print("Sum = "+sum+" Avg = "+avg);
    }
    
}
