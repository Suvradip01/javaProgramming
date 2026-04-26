import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = sc.nextDouble();
        System.out.println(factorial(num));
    }
    static double factorial(double num){
        double fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
}

