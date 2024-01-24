package play;

import java.util.logging.Logger;

public class WildcardMatching {
     Logger logger = Logger.getLogger(getClass().getName());
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int iIndex = -1;
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                ++i;
                ++j;
            } else if (j < p.length() && p.charAt(j) == '*') {
                starIndex = j;
                iIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = iIndex + 1;
                iIndex++;
            } else {
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == '*') {
            ++j;
        }
        return j == p.length();
    }



    public static void main(String[] args) {
        WildcardMatching wm= new WildcardMatching();
        String s="aab";  
        String  p="*ab";

        
        Boolean  f=wm.isMatch(s,p);
        System.out.println(f);
    }
}
