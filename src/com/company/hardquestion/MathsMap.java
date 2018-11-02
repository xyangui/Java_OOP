package com.company.hardquestion;

import java.util.HashMap;
import java.util.Set;

public class MathsMap<K, V> implements Mathematical<MathsMap<K,V>> {

    private HashMap<K, V> hashMap;

    public MathsMap(){
        hashMap = new HashMap<>();
    }

    public HashMap<K, V> getHashMap(){
        return hashMap;
    }

    public V get(K key){
        return hashMap.get(key);
    }

    public void put(K key, V value){
        hashMap.put(key, value);
    }

    public void remove(K key){
        hashMap.remove(key);
    }

    public MathsMap<K, V> add(MathsMap<K, V> other){
        MathsMap<K, V> result = new MathsMap<>();

        for(K key: hashMap.keySet()) {
            result.put(key, hashMap.get(key));
        }


        for(K key: other.getHashMap().keySet()) {
           if(!result.getHashMap().containsKey(key)){
               result.put(key, other.get(key));
           }
        }

        return result;
    }

    public MathsMap<K, V> subtract(MathsMap<K, V> other){

        MathsMap<K, V> result = new MathsMap<>();

        for(K key: hashMap.keySet()) {
            result.put(key, hashMap.get(key));
        }


        for(K key: other.getHashMap().keySet()) {
            if(result.getHashMap().containsKey(key)){
                result.remove(key);
            }
        }
        return result;
    }

    public String toString(){

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

        result = result + "}";

        return result;
    }
}
