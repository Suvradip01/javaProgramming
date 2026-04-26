import java.util.Scanner;
public class largestNumber{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many numbers? ");
    int n = sc.nextInt();

    int max = Integer.MIN_VALUE; // start with smallest possible number
    for (int i = 0; i < n; i++) {
        int num = sc.nextInt();
        if (num > max) {
            max = num;
        }
    }
    System.out.println("Greatest: " + max);
    sc.close();

    }
}

