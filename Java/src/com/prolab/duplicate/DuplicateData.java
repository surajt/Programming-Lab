package com.prolab.duplicate;

import java.util.Arrays;
import java.util.*;

public class DuplicateData {

    public static void mainApplication()
    {
        String[] myString = {"horse", "dog", "cat", "horse","dog"};
        String[] myRefine = removeDups(myString);
        System.out.println("------------Input String------------");
        System.out.println(Arrays.toString(myString));
        System.out.println("------------Output String------------");

        for(String a:myRefine) {
            System.out.println(a);
        }

        System.out.println("Using Hash Set ");
        String[] myRefineSet = removeDupsBySet(myString);
        for(String a:myRefineSet) {
            System.out.println(a);
        }

    }

    public static String[] removeDups(String[] arr) {
        int end = arr.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        String[] mainlist = new String[end];
        for(int i = 0; i < end; i++){
            mainlist[i] = arr[i];
        }
        return mainlist;
    }

    public static String[] removeDupsBySet(String[] arr) {
        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        return set.toArray(new String[set.size()]);
    }

}
