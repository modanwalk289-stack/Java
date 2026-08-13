import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        
        int [] arr ={1,2,3,4,4,5,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate: "+arr[i]);
            }
            set.add(arr[i]);
        }
    }
    
}
