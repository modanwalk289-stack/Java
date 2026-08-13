import java.util.HashSet;

public class hashset_remove_dup {
    public static void main(String[] args) {
        int arr[]={1,2,32,12,1,2,3,2,3};
        HashSet<Integer> set =  new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
