package com.company.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class CategorisedMap<K, V, C extends Categoriser<V, K>> {

    private HashMap<K, ArrayList<V>> hashMap;
    private C categoriser;

    public CategorisedMap(C categoriser){
        hashMap = new HashMap<>();
        this.categoriser = categoriser;
    }

    public void put(V value){
        K k = categoriser.categorise(value);
        if(hashMap.containsKey(k)){
            hashMap.get(k).add(value);
        } else {
            ArrayList<V> vArrayList = new ArrayList<>();
            vArrayList.add(value);
            hashMap.put(k, vArrayList);
        }
    }

    public int getCategoryCount(V value){
        K k = categoriser.categorise(value);
        if(hashMap.containsKey(k)){
            return hashMap.get(k).size();
        }
        return 0;
    }

    public String toString(){
        String result = "";
        for(K key: hashMap.keySet()) {

            result += key.toString() + ": ";

            for(V v: hashMap.get(key)){
                result += v.toString() + ", ";
            }
        }
        return result;
    }
}
