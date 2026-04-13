import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mapST.containsKey(charS) && mapST.get(charS) != charT) return false;
            if (mapTS.containsKey(charT) && mapTS.get(charT) != charS) return false;
            mapST.put(charS, charT);
            mapTS.put(charT, charS);
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings solver = new IsomorphicStrings();
        System.out.println(solver.isIsomorphic("egg", "add"));
        System.out.println(solver.isIsomorphic("foo", "bar"));
    }
}