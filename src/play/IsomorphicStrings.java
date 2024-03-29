package play;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /*
     * Given two strings s and t, determine if they are isomorphic. 
     * Two strings are isomorphic if the characters in s can be replaced to get t.
        For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.

        Analysis
        We need to define a method which accepts a map & a value, and returns the value’s
        key in the map.
    */
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        if (s.length() == 0 && t.length() == 0)
            return true;
           

        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            Character c = getKey(map, c2);
            if (c != null && c != c1) {
                return false;
            } else if (map.containsKey(c1)) {
                if (c2 != map.get(c1))
                    return false;
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }

    // a method for getting key of a target value
    public Character getKey(HashMap<Character, Character> map, Character target) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue().equals(target)) {
                return entry.getKey();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        IsomorphicStrings is= new IsomorphicStrings();
        
      System.out.println(is.isIsomorphic("ada", "egg"));
    }

}
