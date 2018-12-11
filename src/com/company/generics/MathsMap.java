package com.company.generics;

import java.util.HashMap;

public class MathsMap<K, V> implements Mathematical<MathsMap<K, V>> {

    private HashMap<K, V> map;

    public MathsMap() {
        this.map = new HashMap<>();
    }

    public MathsMap(HashMap<K, V> map) {
        this.map = map;
    }

    public HashMap<K, V> getMap() {
        return map;
    }

    public void setMap(HashMap<K, V> map) {
        this.map = map;
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public MathsMap<K, V> add(MathsMap<K, V> item) {

        MathsMap<K, V> newMap = new MathsMap<>();
        newMap.getMap().putAll(map);

        for (K key : item.getMap().keySet()) {
            if (!newMap.getMap().containsKey(key)) {
                newMap.put(key, item.getMap().get(key));
            }
        }
        return newMap;
    }

    public MathsMap<K, V> subtract(MathsMap<K, V> item) {

        MathsMap<K, V> newMap = new MathsMap<>();
        newMap.getMap().putAll(map);

        for (K key : item.getMap().keySet()) {
            if (newMap.getMap().containsKey(key)) {
                newMap.remove(key);
            }
        }
        return newMap;
    }

    public String toString() {

        String output = "{";
        for (K key : map.keySet()) {
            output += key.toString() + "=" + map.get(key).toString() + ",";
        }
        // remove the "," from the end of the string
        output = output.substring(0, output.length() - 2);
        return output + "}";
    }
}
