import java.util.Scanner;
public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num == 1){
            System.out.println("not Prime");
            return;
        }
        for(int i = 2; i <= num/2; i++){   //use Math.sqrt(num) for less time complexity
            if(num % i ==  0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("not Prime");
        }

    }
}