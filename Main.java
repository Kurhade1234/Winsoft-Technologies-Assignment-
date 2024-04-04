import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";


        Map<Character, Integer> charCountMap = new HashMap<>();


        char[] charArray = str.toCharArray();


        for (char c : charArray) {
            // Ignore spaces
            if (c != ' ') {

                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }


        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}