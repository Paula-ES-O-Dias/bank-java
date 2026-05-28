package com.bank.study.estruturasdedados;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> nomeMap = new HashMap<>();
        nomeMap.put("123", "Maria");
        nomeMap.put("321", "Ana");
        nomeMap.put("543", "Helena");
        for (String value: nomeMap.values()) {
            System.out.println(value);
        }
        nomeMap.put("321", "Joana");
        for (String key: nomeMap.keySet()) {
            System.out.println(key);
            System.out.println(nomeMap.get(key));
        }
        for (Map.Entry<String,String> entry: nomeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        nomeMap.forEach((key,value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
