public class  leetcodeQ{
    public static void main(String[] args) {
        int num = 234;
        int savedProduct = (Product(num));
        int savedSum = Sum(num);

        int Difference = savedProduct - savedSum;
        System.out.println("Product : "+savedProduct);
        System.out.println("Product : "+savedSum);
        System.out.println("Difference is = "+Difference);
    }

    static int Product(int num){
        int product = 1;
        while(num>0){
            int rem = num%10;
            product *= rem;
            num = num/10;
        }
        return product;
    }

    static int Sum(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
}