// HashSet Search works only on sorted array allows
// Time Complexity:
// Average case: O(n)
// Worst case: O(n)
// Space Complexity: O(n)
// Auxiliary Space Complexity: O(n)

package Arrays.SearchingAlgo;
import java.util.HashSet;

public class Hashset {
    public static boolean haashsearch(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }
        return set.contains(target);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 60;
        System.out.println(haashsearch(arr, target));
    }
}
