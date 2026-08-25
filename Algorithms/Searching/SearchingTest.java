import java.util.Arrays;
public class SearchingTest{
    public static void main(String[]args){
        Searching s=new Searching();
        int[] arr={1,5,10,10,4,20,50};
        s.linearSearch(arr,5);
        Arrays.sort(arr);
        s.binarySearch(arr,4,0, arr.length-1);
    }
}