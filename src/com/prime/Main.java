package com.prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no to be checked for prime");
        int n=in.nextInt();
        Boolean b=isprime(n);
        System.out.println(b);
    }
    static boolean isprime(int n)
    {

            if (n == 1)
                return false;
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    return false;
                }
                c = c + 1;
            }
            return true;


    }

}
