import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int range = sc.nextInt();
        int[]arr = new int[range];
        System.out.print("Enter elements : ");

        for(int i = 0; i < range; i++){
            arr[i] = sc.nextInt();          //array input
        }

        System.out.print("[");
        for (int ele : arr) {
            System.out.print(ele + " ");         //array print
        }
        System.out.print("]");

    }
}