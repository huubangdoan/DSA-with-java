class algo {
    public void binarySearch(int[] arr, int e) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            if (arr[left] == e) {
                System.out.printf("found %d at index %d%n", e, left);
                return;
            }
            if (arr[right] == e) {
                System.out.printf("found %d at index %d%n", e, right);
                return;
            }
            System.out.printf("not found %d at index %d or %d%n ", e, left, right);
            left++;
            right--;
        }

        System.out.println("not found");
    }
}
public class TwoPointer{
    public static void main(String[]args){
        algo algo= new algo();
        int[] arr={3,4,1,10,2,4,5,4,4,4,4};
        algo.binarySearch(arr, 5);
    }
}