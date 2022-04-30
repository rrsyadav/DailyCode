package com.fibonaci;

import java.util.Scanner;

public class FibWithoutArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int next=a+b;
        int count = 2;
        System.out.print (a+" "+b);
        while (count < n) {
            int temp=b;
             b= b+a;
             a=temp;
            count++;
            System.out.print(" "+b);
        }
    }
}


