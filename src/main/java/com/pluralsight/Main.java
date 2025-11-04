package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.ofEpochDay(15)); // this line should fail
        System.out.println(dates.getItems().size());
        FixedList<String> string = new FixedList<>(4);
        string.add("10");
        string.add("3");
        string.add("92");
        string.add("43");
        string.add("4failure");// this line should fail
        System.out.println(string.getItems().size());

    }
}
