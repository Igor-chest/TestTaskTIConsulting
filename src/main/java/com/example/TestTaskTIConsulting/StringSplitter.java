package com.example.TestTaskTIConsulting;

import java.util.*;
import java.util.stream.Collectors;

public class StringSplitter {
    public static Map<Character, Integer> stringSplit(String inputString) {
        Map<Character, Integer> resultMap = new TreeMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char key = inputString.charAt(i);

            resultMap.merge(key, 1, Integer::sum);
        }

        resultMap = mapSort(resultMap);

        return resultMap;
    }

    private static Map<Character, Integer> mapSort(Map<Character, Integer> resultMap) {
        resultMap = resultMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));

        return resultMap;
    }
}
