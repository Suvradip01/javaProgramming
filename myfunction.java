
import java.util.Scanner;

public class myfunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1,num2);
    }

    static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("num1 = "+x+"\nnum2 = "+y);
    }
}