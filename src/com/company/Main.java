package com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] arrayOfWord = {"one", "two", "three"};
        Integer[] arrayOfNumbers = {1, 2, 3};

        SimpleFilter filter = new SimpleFilter();

        Object[] filteredWords = filter(arrayOfWord, filter);
        Object[] filteredNumbers = filter(arrayOfNumbers, filter);

        for (Object words : filteredWords) {
            System.out.println(words);
        }

        for (Object numbers : filteredNumbers) {
            System.out.println(numbers);
        }

        //Практическое задание - Collection - count of elements

        String[] elements = {"one", "two", "three", "four", "two", "one"};

        Map<Object, Integer> map = countOfElements(elements);
        System.out.println(map);


    }

    public static Object[] filter(Object[] anyArray, Filter filter) {
        Object[] result = new Object[anyArray.length];
        for (int i = 0; i < anyArray.length; i++) {
            result[i] = filter.apply(anyArray[i]);
        }
        return result;
    }

    public static Map<Object, Integer> countOfElements(Object[] elements) {
        Map<Object, Integer> result = new HashMap<>();
        for (Object element : elements) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1);
            } else {
                result.put(element, 1);
            }
        }
        return result;
    }
}
