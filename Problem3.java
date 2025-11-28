import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        int n = (a % 2 == 0) ? (a - 1) : a;
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            oddList.add(2 * i - 1);
        }
        System.out.println("Output: " + oddList);
        sc.close();
    }
}
