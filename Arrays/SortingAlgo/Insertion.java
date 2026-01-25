// Insertion Sort :
// Time Complexity :
// Best Case: O(n)
// Average Case: O(n2)
// Worst Case: O(n2)
// Space Complexity : O(1)

import java.util.Arrays;
class Insertion {
     public static void insertion(int[] arr, int n) {
        for(int i=1;i<n;i++) {
            int item = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>item) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,5,799,8};
        int n = arr.length;
        insertion(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
