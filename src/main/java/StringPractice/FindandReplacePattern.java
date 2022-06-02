//https://leetcode.com/problems/find-and-replace-pattern/
package StringPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindandReplacePattern {
    public void demo() {
         System.out.println("-----");
        String[] words= {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> matched = findAndReplacePattern(words, pattern);
        for (String str :matched) System.out.println(str);
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matched = new ArrayList<>();
        String normalizedPattern = normalize(pattern);
        for (String word : words) {
            if (word.length() != pattern.length()) continue;
            if (normalizedPattern.equals(normalize(word)))
                matched.add(word);

        }
        return matched;
    }

    private String normalize(String str) {
        HashMap<Character, Character> seen = new HashMap<>();
        char next = 'a';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!seen.containsKey(str.charAt(i))) {
                seen.put(str.charAt(i), next);
                next++;
            }
            sb.append(seen.get(str.charAt(i)));
        }
        return sb.toString();
    }
}
