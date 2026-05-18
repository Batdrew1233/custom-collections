package com.pluralsight.collection;

import java.time.LocalDate;

public class CustomCollection {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);
        System.out.println(numbers.getItems());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now().withDayOfMonth(1));
        System.out.println(dates.getItems());
    }
}
