package com.company;

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

    }

    public static Object[] filter(Object[] anyArray, Filter filter) {
        Object[] result = new Object[anyArray.length];
        for (int i = 0; i < anyArray.length; i++) {
            result[i] = filter.apply(anyArray[i]);
        }
        return result;
    }
}
