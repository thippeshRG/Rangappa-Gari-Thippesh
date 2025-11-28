import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("First " + a + " odd numbers:");
        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1; 
            System.out.print(odd);
            if (i < a) {
                System.out.print(", ");
            }
        }
        System.out.println();
        sc.close();
    }
}
