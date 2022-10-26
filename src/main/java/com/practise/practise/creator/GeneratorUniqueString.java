package com.practise.practise.creator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GeneratorUniqueString {

    private final UserRequirements userRequirements;
    private static final LinkedList<String> tmp = new LinkedList<>();

    public GeneratorUniqueString(UserRequirements userRequirements) {
        this.userRequirements = userRequirements;
    }

    public LinkedList<String> getAllStrings() {

        int x = userRequirements.getMax();
        String[] arr = userRequirements.getArrayString();
        String[] ml = arr;

        for (int z = 0; z < x - 1; z++) {
            for (String value : arr) {
                for (String s : ml) {
                    if (!Objects.equals(value, s)) {
                        tmp.add(s + value);
                    }
                }
            }

            ml = tmp.toArray(new String[0]);
        }
        tmp.addAll(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            StringBuilder a = new StringBuilder();
            for (int b = 0; b < x; b++) {
                String d = arr[i];
                a.append(d);
            }
            tmp.add(a.toString());
        }
        return tmp;
    }

    public List getElementsBySize() {
        int min = userRequirements.getMin();
        int max = userRequirements.getMax();
        return tmp.stream()
                .filter(l -> l.length() >= min)
                .filter(l -> l.length() <= max)
                .collect(Collectors.toList());

    }
}
