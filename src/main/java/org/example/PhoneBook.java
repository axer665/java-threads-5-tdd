package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    public static String notNumberMessage = "В справочнике нет такого номера телефона";
    public static String notNameMessage = "В справочнике нет такого имени";
    Map<String, String> guide = new HashMap<>();
    public int add(String name, String number) {
        if (!guide.containsValue(number)) {
            guide.put(name, number);
        }
        return this.guide.size();
    }

    public String findByNumber(String number) {
        if (guide.containsValue(number)){
            for (Map.Entry<String, String> entry: guide.entrySet()) {
                if (entry.getValue() == number) {
                    return entry.getKey();
                }
            }
        }
        return notNumberMessage;
    }

    public String findByName(String name) {
        return guide.containsKey(name) ? guide.get(name) : notNameMessage;
    }

    public List<String> printAllNames() {
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry: guide.entrySet()) {
            names.add(entry.getKey());
        }
        return names.stream().sorted().collect(Collectors.toList());
    }
}
