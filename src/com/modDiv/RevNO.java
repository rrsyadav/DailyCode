package com.modDiv;

public class RevNO {
    public static void main(String[] args) {


        int n = 12356;
        int rem=0;
        int revno=0;

        while (n >0)
        {

            rem=n%10;
            revno = revno*10+rem;
            n=n/10;

        }
        System.out.println(revno);
    }
}
