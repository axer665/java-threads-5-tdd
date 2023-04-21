package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return null;
    }
}
