import java.util.*;
import java.io.*;
public class shoppinglisteasy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());           // n = the number of shopping lists, 1 ≤ n ≤ 20

        HashMap<String, Integer> foods = new HashMap<>();   // will keep track how many times a food item appears in n-lists

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                String food = st.nextToken();
                if(foods.containsKey(food)) {
                    foods.put(food, foods.get(food) + 1);   // if the food item is already in the map, increment the value by 1
                } else {
                    foods.put(food, 1);                     // else, add the food item to the map with a value of 1
                }
            }
        }

        TreeSet<String> result = new TreeSet<>();   // will store the food items that appear in all n-lists alphabetically 
        for(String food : foods.keySet()) {
            if(foods.get(food) == n) {              // if the food item appears in n times, then add it to the result list
                result.add(food);
            }
        }

        System.out.println(result.size());  // prints the num of items that were found in all n-lists
        for(String item : result) {
            System.out.println(item);       // prints the items in alphabetical order
        }
    }
}