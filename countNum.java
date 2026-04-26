import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 99;
        int count = 0;

        System.out.print("Enter digit to count occurrence: ");
        int num = sc.nextInt();

        while (number > 0) {
            int rem = number % 10; // extract last digit
            if (rem == num) {
                count++;
            }
            number = number / 10; // remove last digit
        }

        System.out.println("Occurrence: " + count);
        sc.close();
    }
}
