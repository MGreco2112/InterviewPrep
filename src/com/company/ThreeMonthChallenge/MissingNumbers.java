package com.company.ThreeMonthChallenge;

import java.util.*;

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> missingNumbers = new ArrayList<>();

        Map<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arrMap.containsKey(arr.get(i))) {
                int value = arrMap.get(arr.get(i));
                value++;
                arrMap.put(arr.get(i), value);
            } else {
                arrMap.put(arr.get(i), 1);
            }
        }

        for (int i = 0; i < brr.size(); i++) {
            if (arrMap.containsKey(brr.get(i))) {
                int value = arrMap.get(brr.get(i));
                value--;
                arrMap.put(brr.get(i), value);
            }
        }

        System.out.println(arrMap);

        for (Integer num : brr) {
            if (!arr.contains(num)) {
                missingNumbers.add(num);
            }
        }

        for (Integer num : arrMap.keySet()) {
            if (arrMap.get(num) != 0) {
                missingNumbers.add(num);
            }
        }

        Collections.sort(missingNumbers);

        return missingNumbers;

    }
}
