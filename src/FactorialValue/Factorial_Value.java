package FactorialValue;

import java.util.Scanner;

public class Factorial_Value {
    public static void main(String[] arg){
        int i,num,fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter nuber:");
        num=scanner.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of"+num+"is:"+fact);
    }
}
