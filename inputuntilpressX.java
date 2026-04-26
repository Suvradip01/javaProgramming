import java.util.Scanner;

public class inputuntilpressX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter number (or x to stop): ");
            String numinput = sc.next();

            if (numinput.equals("x")) {
                break;
            }

            int num = Integer.parseInt(numinput);
            sum = sum + num;
        }

        System.out.println("Sum : " + sum);
    }
}
