
package com.fibonaci;

public class FibWithArray {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] arr;
        arr= new int  [10];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]);
        for (int i=2;i<10;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(" "+arr[i]);

        }


    }

}