package com.company.generics;

import com.company.generics.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 1. (4 marks) Write a generic Java class, named Pair, that can store two values of
 different types. Your class must have a single constructor, which has two inputs
 parameters, each input parameter specifying the initial value of one of the
 attributes. The class must also have getter and setter methods for each attribute.

 2. (20 marks) Write a generic Java class, named TwoDHashMap, that can store values
 as key- value pairs similar to a regular Hashmap, but the key is composed of two
 attributes. In addition to appropriate constructors required to support the design
 of your class, TwoDHashMap class must have the following methods.

 public boolean containsKey(K1 k1, K2 k2)
 Tests if an object with key pair (k1, k2) exists. in the map; returns true
 if the key pair exists and false otherwise.

 public V get(K1 k1, K2 k2)
 Returns the value associated with key pair (k1, k2).

 public void put(K1 k1, K2 k2, V v)
 Maps the specified key pair (k1, k2) to value v.

 public ArrayList<Pair> getAllKeys()
 Returns all the keys in the TwoDHashMap.

 You may use any of the classes provided in the Appendix and the Pair class
 from part 1 of the question even if you did not attempt part 1.
*/
public class TwoDHashMap<K1, K2, V> {

    private HashMap<Pair<K1, K2>, V> twoDHashMap;

    public TwoDHashMap(){
        twoDHashMap = new HashMap<>();
    }

    public boolean containsKey(K1 k1, K2 k2){
        Pair<K1, K2> pair = new Pair<>(k1, k2);
        boolean isContainsKey = twoDHashMap.containsKey(pair);
        return isContainsKey;
    }

    public V get(K1 k1, K2 k2){
        Pair<K1, K2> pair = new Pair<>(k1, k2);
        V v = twoDHashMap.get(pair);
        return v;
    }

    public void put(K1 k1, K2 k2, V v){
        Pair<K1, K2> pair = new Pair<>(k1, k2);
        twoDHashMap.put(pair, v);
    }

    public ArrayList<Pair<K1, K2>> getAllKeys(){

        Set<Pair<K1, K2>> pairs = twoDHashMap.keySet();

        // Set => ArrayList
        ArrayList<Pair<K1, K2>> pairArrayList = new ArrayList<>(pairs);

        return pairArrayList;
    }
}
