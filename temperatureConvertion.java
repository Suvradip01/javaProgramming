import java.util.Scanner;
public class temperatureConvertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        double Celcius = sc.nextDouble();
        double farenhiet; 
        farenhiet = (Celcius * 9/5) + 32;
        System.out.println("Farenhiet : "+farenhiet);

    }
}