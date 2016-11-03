/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

/**
 *
 * @author arpdz2
 */
public class Minimal 
{
    public static void main(String args[])
    {
        System.out.println("Congrats on your first program");
        double x = 10.0;
        double y = 20.0;
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
