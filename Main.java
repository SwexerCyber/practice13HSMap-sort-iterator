package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Student> hashmap = new HashMap<Integer, Student>();
        hashmap.put(5, new Student("Dobrynya", 5));
        Student student = new Student("Evgeniy", 2);
        hashmap.put(2, student);
        hashmap.put(3, new Student("Max", 3));
        hashmap.put(1, new Student("Alex", 1));

        for (Map.Entry<Integer, Student> mapEntry : hashmap.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }

        System.out.println("________________________________");

        Iterator iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }

        System.out.println("________________________________");

//        // 1 способ
//        Map<Integer, Student> treeMap = new TreeMap<Integer, Student>(hashmap);
//        System.out.println(treeMap);
//
        //2 способ
        Map<Integer, Student> treeMap1 = new TreeMap<Integer, Student>();
        treeMap1.putAll(hashmap);
        for (Map.Entry<Integer, Student> entry : treeMap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //3 способ
        List<Student> arrayList = new ArrayList<Student>(hashmap.values());
        Collections.sort(arrayList);
        for (Map.Entry<Integer, Student> mapEntry : hashmap.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }

        System.out.println("________________________________");

        for (Student item : arrayList) {
            System.out.println(item);
        }
    }
}
