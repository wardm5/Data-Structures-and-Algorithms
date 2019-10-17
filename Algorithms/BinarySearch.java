public class BinarySearch{
     public static void main(String []args){
        System.out.println("Hello World");
        int[] arr = new int[] {1,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, -1));
        int[] arr2 = new int[] {1,1,1,1,1,1,1,1};
        System.out.println(binarySearch2(arr2));  // 5
     }
     public static int binarySearch(int[] arr, int target) {
         int left = 0;
         int right = arr.length-1;
         while (left <= right) {
            int mid = ((right - left) / 2) + left;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
         }
         return -1;
     }
     public static int binarySearch2(int[] arr) {
         int left = 0;
         int right = arr.length-1;
         while (left < right) {
            int mid = ((right - left) / 2) + left;
            if (arr[mid] == 0 && arr[mid + 1] == 1)
                return mid;
            else if (arr[mid] == 1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
         }
         return -1;
     }
}
