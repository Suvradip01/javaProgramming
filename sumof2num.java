import java.util.Scanner;

public  class sumof2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        findsum(num1,num2);

    }

    static void findsum(int num1,int num2){
            System.out.println("Sum : "+(num1+num2));
        }
}