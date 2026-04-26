
// import java.util.Scanner;

// public class ArrayReverse{

//     static int[] reverse(int arr[]){
//         int[] reversed = new int[arr.length];
//         int j = 0;
//         for(int i = arr.length-1; i >= 0; i--){
//              reversed[j] = arr[i];
//              j++;
//         }
//         return reversed;
//     }

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter length of the array : ");
//             int length = sc.nextInt();
//             int arr[] = new int[length];
//             System.out.println("Enter " + length + " elements:");
            
//             for(int i = 0; i < length; i++){
//                 System.out.print("Enter elements at index "+i+" : ");
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println("Original Array:");
//             for(int i = 0; i < length; i++){
//                 System.out.print(arr[i] + " ");
//             }
            
//             int reverseArray[] = reverse(arr);
            
//             System.out.println("\nReversed Array:");
//             for(int num : reverseArray) {
//                 System.out.print(num + " ");
//             }
//         }
//     }
// }




import java.util.Scanner;

public class ArrayReverse {

    static void reverseInPlace(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length of the array : ");
            int length = sc.nextInt();
            int arr[] = new int[length];
            System.out.println("Enter " + length + " elements:");

            for (int i = 0; i < length; i++) {
                System.out.print("Enter element at index " + i + " : ");
                arr[i] = sc.nextInt();
            }

            System.out.println("\nOriginal Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            reverseInPlace(arr);  // reverses the array itself

            System.out.println("\nReversed Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
