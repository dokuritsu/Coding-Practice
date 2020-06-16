package two;
import java.util.*;

/**
 * Hello world!
 */
public final class firstNonDupChar {
    private firstNonDupChar() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        String str = "cdcd";
        Character ret = firstNonRepeatedCharacter(str);
        System.out.println("First non-duplicate character: " + ret);
    }

    public static Character firstNonRepeatedCharacter(String str) {
        // creating a hash table 
        LinkedHashMap<Character, Integer> h = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            if(h.containsKey(key)){
                h.put(key, h.get(key) + 1);
            } else {
                h.put(key, 1);
            }
        }

        // Generating a Set of entries
        Set set = h.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           if((Integer)me.getValue() == 1){
               return (Character)me.getKey();
           }
        }

        return null;

    }
}
