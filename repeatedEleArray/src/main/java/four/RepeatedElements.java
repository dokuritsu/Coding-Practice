package four;

import java.util.*;

/**
 * Hello world!
 */
public final class RepeatedElements {
    private RepeatedElements() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] num = {1,3,4,2,1,2,4};
        String r = duplicate(num);

        System.out.println(r);
    }

    public static String duplicate(int[] numbers){
        LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();

        for(int i = 0; i < numbers.length; i++){
              Integer n = numbers[i];
              if(h.containsKey(n)){
                h.put(n, h.get(n) + 1);
                } else {
                    h.put(n, 1);
                }
        }

        // Generating a Set of entries
        Set set = h.entrySet();

        // Displaying elements of LinkedHashMap
        ArrayList<Integer> result = new ArrayList<Integer>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           if((Integer)me.getValue() > 1){
               result.add((Integer)me.getKey());
           }
        }

        // Sort
        Collections.sort(result);
        
        return result.toString();
    }
}
