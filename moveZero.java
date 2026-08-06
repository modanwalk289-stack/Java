public class moveZero{
     public static void main(String[] args) {
        

        int[] arr ={0,2,12,0,34,6};
        int i ,temp=0;

        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
              arr[temp]=arr[i];
              temp++;
             
            }
        }
            while(temp<arr.length){
                arr[temp]=0;
                temp++;
            }
            for(i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        
     }
}