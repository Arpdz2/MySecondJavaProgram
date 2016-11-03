/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.util.*;

/**
 *
 * @author arpdz2
 */
public class Minimal 
{
    public static void main(String args[])
    {
        int x;
        int y;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a value for x: ");
        x = sc.nextInt();
        
        System.out.println("Please enter a value for y: ");
        y = sc.nextInt();
        
        double sum;
        double difference;
        double product;
        double quotient;
        double remainder;
        double average;
        
        sum = x + y;
        difference = y - x;
        product = x * y;
        quotient = x / y;
        remainder = x % y;
        average = sum / 2.0;
                
        System.out.println("Sum = "+ sum );
        System.out.println("Difference = "+ difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
        System.out.println("Averave = "+average);
    }
    
}
