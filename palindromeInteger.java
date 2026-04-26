import java.util.Scanner;

public class palindromeInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String num = sc.next();

        int originalnum = Integer.parseInt(num);  //save original value
        int length = num.length();                //length of the number as string
        String temp = "";                   //for storing the string value future

        for(int i = length-1;i >= 0; i--){
            temp += num.charAt(i);                                                                          
        }

        int ispalindrome = Integer.parseInt(temp);   //after reversing the number converting to int

        if(ispalindrome == originalnum){
            System.out.println(+ispalindrome+" Palindrome.");
        }
        else{
            System.out.println(+ispalindrome+" not Palindrome.");
        }
    }
}
