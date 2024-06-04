import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DailyChallenge04062024 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int x = scannerObject.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 1 ; i <= n ; i++) {
            String name = scannerObject.next();
            int mark = scannerObject.nextInt();
            hashMap.put(name, mark);
        }
        findTheX(x, hashMap);
        scannerObject.close();
    }

    public static void findTheX(int x, HashMap<String, Integer> hashMap) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> marksList = new ArrayList<>();
        int requiredRank = 0;

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            marksList.add(entry.getValue());
        }

        marksList.sort(Collections.reverseOrder());

        for(int i : marksList) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue().equals(i)) {
                    sortedMap.put(entry.getKey(), i);
                }
            }
        }

        System.out.println(sortedMap);

        HashMap<Integer, Integer> ranks = new HashMap<>();

        for(int i : marksList) {
            ranks.put(i, ranks.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : ranks.entrySet())  {
            if(entry.getValue() == x) {
                requiredRank = entry.getKey();
            }
        }

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == requiredRank) {
                System.out.println(entry.getKey());
            }
        }
    }
}
