// Bubble Sort :
// Time Complexity :
// Best Case: O(n)
// Average Case: O(n2)
// Worst Case: O(n2)
// Space Complexity : O(1)

class Bubble {
    public static void bubblesort(int[] arr, int n) {
        for(int i=0;i<n-1;i++) {
            boolean swapped = false;

            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; //if no swap array already sorted
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,6,1,3,2};
        int n = arr.length;

        bubblesort(arr, n);

        for(int num:arr) {
            System.out.println(num);
        }
    }
}