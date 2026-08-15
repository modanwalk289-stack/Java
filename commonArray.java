public class commonArray{
    public static void main(String[] args) {
        int[]arr1={5,23,12,43,13};
        int[]arr2={23,4,31,13,11};

        int temp;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                  System.out.print(arr1[i]+" ");
                }
            }
        }

    }
}