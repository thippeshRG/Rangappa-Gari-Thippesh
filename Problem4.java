import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to add: ");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(i, 0);
        }
        for (int k = 1; k <= 9; k++) {
            int count = 0;

            for (int num : list) {
                if (num % k == 0) {
                    count++;
                }
            }
            map.put(k, count);
        }
        System.out.println("Final Output: \n"+map);
        sc.close();
    }
}