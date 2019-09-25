import java.util.Arrays;

public class BubbleSort {

/*
    sample array with 5 items
    [34,56,22,7,23]
 */
    public static int[] bubbleSort(int[] arr) {
/*
   if the contains only one item return
   i.e [1] or ["m"]
 */
        if (arr.length == 1) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
          /*
                Compare current value against all values  in the array.
                i.e in the sample  index 0 item array => 34 will be compared against all values
                The largest values will be swapped to the end.
           */
                if (arr[j] < arr[i]) {
                    int temp = arr[i]; // store the value compared against all other values in the array in temp
                    arr[i] = arr[j]; // swap value at index i with item-j
                    arr[j] = temp; // set item-j as temp
                }

            }

        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {34,56,22,7,23};
        System.out.print(Arrays.toString(bubbleSort(arr)));
    }
}
