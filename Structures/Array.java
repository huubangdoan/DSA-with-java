package Structures;
import java.util.ArrayList;
class algo{
    public static void insert(ArrayList<Integer> arr, int e, int pos){
        shiftingRight(arr, pos);
        arr.set(pos, e);
    }
    public static void shiftingRight(ArrayList<Integer> arr, int pos){
        int n=arr.size();
        arr.add(0);
        int i=n-1;
        //backward traversal
        while (true){
            if (i==pos-1){
                return;
            }
            arr.set(i+1, arr.get(i));
            i--;
        }
    }
    public static void shiftingLeft(ArrayList<Integer> arr, int pos){
        int n=arr.size();        
        for(int i=pos; i<n-1; i++){
            arr.set(i, arr.get(i+1));
        }
        arr.remove(n-1);
    }
}
public class Array{
    public static void main(String[]args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        //algo.insert(arr, 100, 1);
        algo.shiftingLeft(arr,1);
        System.out.println(arr);
    }
}
