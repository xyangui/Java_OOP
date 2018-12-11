package com.company.generics;

import java.util.HashMap;

public class MathsMap<K, V> implements Mathematical<MathsMap<K, V>> {

    private HashMap<K, V> hashMap;

    public MathsMap() {
        this.hashMap = new HashMap<>();
    }

    public MathsMap(HashMap<K, V> map) {
        this.hashMap = map;
    }

    public HashMap<K, V> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<K, V> map) {
        this.hashMap = map;
    }

    public V get(K key){
        return hashMap.get(key);
    }

    public void put(K key, V value) {
        hashMap.put(key, value);
    }

    public void remove(K key) {
        hashMap.remove(key);
    }

    public MathsMap<K, V> add(MathsMap<K, V> other) {

        MathsMap<K, V> newMap = new MathsMap<>();
        newMap.getHashMap().putAll(hashMap);

        for (K key : other.getHashMap().keySet()) {
            if (!newMap.getHashMap().containsKey(key)) {
                newMap.put(key, other.get(key));
            }
        }
        return newMap;
    }

    public MathsMap<K, V> subtract(MathsMap<K, V> other) {

        MathsMap<K, V> newMap = new MathsMap<>();
        newMap.getHashMap().putAll(hashMap);

        for (K key : other.getHashMap().keySet()) {
            if (newMap.getHashMap().containsKey(key)) {
                newMap.remove(key);
            }
        }
        return newMap;
    }

    public String toString() {

        String result = "{";
        boolean isFirst = true;

        for(K key: hashMap.keySet()) {
            if(isFirst){
                result = result + key.toString() + "=" + hashMap.get(key).toString();
                isFirst = false;
            } else {
                result = result + "," + key.toString() + "=" + hashMap.get(key).toString();
            }
        }

//        for (K key : hashMap.keySet()) {
//            result += key.toString() + "=" + hashMap.get(key).toString() + ",";
//        }
//        // remove the "," from the end of the string
//        result = result.substring(0, result.length() - 2);

        return result + "}";
    }
}
