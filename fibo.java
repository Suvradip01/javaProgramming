import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 0; i <= num; i++) {
            System.out.print(first + " ");//" " for spacing
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
