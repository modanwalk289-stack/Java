public class secondLargestEle {
    public static void main(String[] args){

        int[]arr={10,40,34,11,45};
        int i , largest=0,secondlargest=0;

        for(i=0;i<arr.length;i++){
            if(arr[i]>largest){
              secondlargest=largest;
              largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }

        System.out.println("Largest Element = "+largest);
        System.out.println("Second largest Element = "+secondlargest);


    }
}
