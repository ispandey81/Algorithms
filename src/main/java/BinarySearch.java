public class BinarySearch {

    public static int binarySearch(int [] arr, int key, int low, int high) {
        int index = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr, 7, 0, arr.length));
    }
}
