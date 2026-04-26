import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String numStr = sc.nextLine();
        double length = numStr.length();

        int originalnum = Integer.parseInt(numStr);
        int temp = originalnum;
        int checksum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            checksum += Math.pow(digit, length);
            temp /= 10;
        }

        if (originalnum == checksum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not Armstrong");
        }
    }
}
