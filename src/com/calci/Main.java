package com.calci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);



        int res=0;


        while(true)
        {
            System.out.println("Enter the operator or press X to exit " );
            char op=in.next().charAt(0);
            int num1= in.nextInt();
            int num2= in.nextInt();
           if(op=='+' || op == '-' || op=='*' || op=='/')
           {
             if (op=='+')
                 res=num1+num2;
             if (op=='-')
                 res=num1-num2;
             if (op=='*')
                   res=num1*num2;
             if (op=='/') {
                 if(num2==0)
                     System.out.println("Cannot divide by zero");
                 else
                 res = num1/num2;
             }

           }
           else if (op=='x' || op=='X') {
               System.out.println("Calculator Prog Exit ");
               break;
           }
           else
               System.out.println("Invalid Operation");
            System.out.println(res);


        }


    }
}
