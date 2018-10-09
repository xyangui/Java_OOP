package com.company.appendix;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseHashMap {
    public static void main() {

        //HashMap<int, String> hMap = new HashMap<int, String>();//不可
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();

        hMap.put(11, "1st");//添加
        hMap.put(22, "2nd");
        hMap.put(33, "3rd");

        String str = hMap.get(22);//根据 key 得到 value

        Set<Integer> set = hMap.keySet(); //返回由 key 组成的集合
        Set<Map.Entry<Integer,String>> setMapEntry = hMap.entrySet();

        hMap.remove(22);//删除

        int size = hMap.size();//大小

        boolean isContainsKey = hMap.containsKey(33); //是否包含指定的 key
        boolean isContainsValue = hMap.containsValue("1st"); //是否包含指定的 value
    }
}
