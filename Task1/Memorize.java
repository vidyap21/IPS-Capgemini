import java.util.HashMap;
import java.util.Scanner;

public class Memorize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of numbers shown to the team
        int N = scanner.nextInt();

        // Input: Array of numbers shown to the team
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input: Number of queries
        int Q = scanner.nextInt();

        // Construct a HashMap to store the frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Process queries
        for (int i = 0; i < Q; i++) {
            int query = scanner.nextInt();
            if (frequencyMap.containsKey(query)) {
                System.out.println(frequencyMap.get(query));
            } else {
                System.out.println("NOT PRESENT");
            }
        }

        scanner.close();
    }
}

