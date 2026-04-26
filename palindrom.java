
import java.util.*;

public class palindrom {

    public static void main(String[] args) {
        int arr[] = {1,1};
        int max = 0;
        int smal = 0;
        
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) { // adding all array elements into the list
            lst1.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) { // finding max
            if (arr[i] < smal) {
                smal = arr[i];
            }
        }
            for (int i = 0; i < arr.length; i++) { // finding max
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            for (int i = smal; i < max; i++) {
                boolean found = false;
                for (int j = 0; j < arr.length; j++) {
                    if (i == arr[j]) {
                        found = true;
                        break;
                    }
                }
                if (found == false) {
                    temp.add(i);
                }
            }

            System.out.print(temp);
        }
    }
