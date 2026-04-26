import java.util.Scanner;

public class prob {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] indices = new int[2];
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n) {
                if ((nums[i] + nums[j]) == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
                j++;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int[] ans = twoSum(nums, target);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");

        sc.close();
    }
}
