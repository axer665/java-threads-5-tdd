package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, String> guide = new HashMap<>();
    public int add(String name, String number) {
        if (!guide.containsValue(number)) {
            guide.put(name, number);
        }
        return this.guide.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}
