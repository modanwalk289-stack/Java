public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3};
        int i=0,j;
        for(j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
