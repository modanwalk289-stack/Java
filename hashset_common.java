import java.util.HashSet;

public class hashset_common {
    public static void main(String[] args) {
        int [] arr1 = {12,22,4,56,43};
        int []arr2= {12,2,32,22,32,43};
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
    
}
