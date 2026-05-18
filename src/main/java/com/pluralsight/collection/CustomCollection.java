package com.pluralsight.collection;

public class CustomCollection {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);
        System.out.println(numbers.getItems());
    }
}
