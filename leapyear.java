import java.util.Scanner;

public  class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        isleapyear(year);
    }

    static void isleapyear(int year){
        
        if(year % 4 == 0){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}