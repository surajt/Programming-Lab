package com.prolab.wordcount;

import java.util.*;

public class WordCount {
    public List<String> aList;

    public void mainApplication() {
        aList = new ArrayList<String>();
        aList.add("Suraj");
        aList.add("Suraj");
        aList.add("Suraj");
        aList.add("John");
        aList.add("John");
        aList.add("James");
        aList.add("Suraj");

        System.out.print("Method 1: Hash Set\n");
        methodOneHashSet();
        System.out.print("Method 1: Hash Map\n");
        methodOneHashMap();
    }

    private void methodOneHashSet() {
        Set<String> uniqueWords = new HashSet<String>(aList);
        for (String word : uniqueWords) {
            System.out.println(word + " : " + frequency(aList, word));
        }
    }

    private void methodOneHashMap() {
        HashMap<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
        for (String word : aList) {
            wordMap.put(word, (wordMap.get(word) == null ? 1 : (wordMap.get(word) + 1)));
        }
        System.out.println(wordMap);
    }

    private int frequency(Collection<?> c, Object o) {
        int result = 0;
        if (o == null) {
            for (Object e : c)
                if (e == null)
                    result++;
        } else {
            for (Object e : c)
                if (o.equals(e))
                    result++;
        }
        return result;
    }

}
