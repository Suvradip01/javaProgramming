import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNum = sc.nextInt();
        int reversedNum = 0;

        while (originalNum > 0) {
            int rem = originalNum % 10;
            reversedNum = reversedNum * 10 + rem; // build reversed number
            originalNum = originalNum / 10;
        }

        System.out.println("Reversed: " + reversedNum);
        sc.close();
    }
}
