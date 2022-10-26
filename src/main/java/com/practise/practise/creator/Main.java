package com.practise.practise.creator;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Given array
        String[] arr = {"c", "a", "b"};

        UserRequirements userRequirements = new UserRequirements(1, 5, arr, 200);

        GeneratorUniqueString generatorUniqueString = new GeneratorUniqueString(userRequirements);
        LinkedList<String> list = generatorUniqueString.getAllStrings();

        for (String s : list) {
            System.out.println(s);
        }

        List<String> list1 = generatorUniqueString.getElementsBySize();
        System.out.println("\n");
        for (String s : list1) {
            System.out.println(s);
        }
        int a = generatorUniqueString.getAllStrings().size();
        System.out.println(a);

       int i = generatorUniqueString.getElementsBySize().size();
        System.out.println(i >= userRequirements.getCountOfString());


    }
}
