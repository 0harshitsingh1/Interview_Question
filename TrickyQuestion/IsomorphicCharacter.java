package TrickyQuestion;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicCharacter {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if (!mp.containsKey(original)) {
                if (!mp.containsValue(replacement)) {
                    mp.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharater = mp.get(original);
                if (mappedCharater != replacement) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "add";
        String t = "egg";
        IsomorphicCharacter Iso = new IsomorphicCharacter();
        System.out.println(Iso.isIsomorphic(s, t));
    }
}
