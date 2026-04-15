package com.gla.collections;

import java.util.Map;
import java.util.TreeMap;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        TreeMap<String, String> countryCapital = new TreeMap<>();
        countryCapital.put("India", "New Delhi");
        countryCapital.put("Japan", "Tokyo");
        countryCapital.put("France", "Paris");

        System.out.println("Lookup India -> " + countryCapital.get("India"));
        System.out.println("Alphabetical print:");
        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

