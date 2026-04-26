import java.util.Arrays;
import java.util.Scanner;

public class 2Darray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        // Input
        System.out.println("Enter elements:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array properly
        System.out.println("2D array :");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
