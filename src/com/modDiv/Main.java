package com.modDiv;

    public class Main {
        public static void main(String[] args) {
            int  n=36638393;
            int count =0;
            while(n>0)
            {
                int  re=n%10;
                if(re==3)
                {
                    count++;
                }
                n=n/10;

                // comment
            }
            System.out.println(count);
        }
    }


