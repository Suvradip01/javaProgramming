import java.util.ArrayList;
import java.util.Scanner;

public class newArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());  // Read input and add to list
        }

        System.out.println("Numbers you entered:");
        for (int element : numbers) {
            System.out.println(element);  // Print each element individually
        }
    }
}


// import java.util.ArrayList;
// import java.util.Scanner;

// public  class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer>numbers = new ArrayList<>();
//         System.out.print("Enter total numbers : ");
//         int n = sc.nextInt();
//         for(int i = 0; i < n;i++){
//             numbers.add(sc.nextInt());
//         }

//         System.out.println(numbers);
//     }
// }