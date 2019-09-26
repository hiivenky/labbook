package com.venkatesh;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"hii");
        hashMap.put(2,"Hello");
        hashMap.put(3,"bye");

        List<String> value = mySort(hashMap);

        for(int i=0;i<value.size();i++){
            System.out.println(value.get(i));
        }

    }
    public static List<String> mySort(HashMap<Integer,String> map){
        List<Map.Entry<Integer,String>> ret = new ArrayList<>(map.entrySet());
        List<String> sorted = new ArrayList<>();
        for(int i=0;i<ret.size();i++){
            sorted.add(ret.get(i).getValue());
        }
        Collections.sort(sorted);
        return sorted;
    }
}
