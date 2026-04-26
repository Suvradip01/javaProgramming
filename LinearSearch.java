import java.util.Scanner;

public class LinearSearch {

    static void findnum(int num, int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " found at index " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search : ");
        int num = sc.nextInt();

        findnum(num, arr, sc);

        sc.close();
    }
}
