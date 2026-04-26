import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        checkEven(num);

    }

    static void checkEven ( int num){
        if (num % 2 == 0) {
            System.out.println("Even");
        } else if (num % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Wrong input");
        }
    }
}
