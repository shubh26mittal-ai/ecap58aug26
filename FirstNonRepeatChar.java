package queuepackage;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class FirstNonRepeatChar {

    public static void main(String[] args) {

        Queue<Character> q = new LinkedList<>();

        int[] frequency = new int[256];

        String str = "aabbc";

        for (char ch : str.toCharArray()) {

            frequency[ch]++;
            q.offer(ch);

            System.out.println("Character: " + ch);

            while (!q.isEmpty() && frequency[q.peek()] > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                System.out.println("No non repeating character");
            } else {
                System.out.println("First non repeating character is: " + q.peek());
            }
        }

        System.out.println(Arrays.toString(frequency));
    }
}
