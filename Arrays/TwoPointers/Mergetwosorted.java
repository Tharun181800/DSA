// Merge Two Sorted Arrays :
// Time Complexity : O(m+n)
// Space Complexity : O(1)

class Mergetwosorted {
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int i = m -1;
        int j = n-1;
        int k = m + n -1;

        while(i>=0 && j>=0) {
            if(arr1[i]>arr2[j]){
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        while(j>=0){
            arr1[k--] = arr2[j--];
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(arr1,arr2,m,n);

        for(int num:arr1) {
            System.out.println(num + " ");
        }
    }
}