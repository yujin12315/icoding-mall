package com.coding.common.utils;

import java.util.*;

public class LandaTest {
    public static void main(String[] args) {

        List<String>  names = Arrays.asList("peter", "anna", "mike", "xenia");


//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                System.out.println(o1.compareTo(o2));
//                return o1.compareTo(o2);
//            }
//        });
        Collections.sort(names, (String a, String b) -> {
            System.out.println(b.compareTo(a));
            return b.compareTo(a);
        });

        System.out.println("=====================");
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        System.out.println(names);

        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);
    }
}
