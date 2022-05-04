package com.arraylist;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(12);
        list.add(67);
        list.add(676);
        list.add(65);
        list.add(60);
        list.add(63);
        list.add(622);
        System.out.println(list);
        list.add(0,89);
        System.out.println(list);
        System.out.println(list.contains(63));
        list.set(2,88);
        System.out.println(list);
    }
}
