
import java.util.Scanner;

public  class  multiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter range : ");
        int range = sc.nextInt();
       
       multiply(num, range);
    }

    static void multiply(int num,int range){
         for(int i =0;i <= range; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}