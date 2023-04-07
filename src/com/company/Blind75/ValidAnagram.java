package com.company.Blind75;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        List<Character> sList = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        List<Character> tList = t.chars().mapToObj(e -> (char)e).collect(Collectors.toList());

        Collections.sort(sList);
        Collections.sort(tList);

        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i) != tList.get(i)) {
                return false;
            }
        }


        return true;
    }
}
