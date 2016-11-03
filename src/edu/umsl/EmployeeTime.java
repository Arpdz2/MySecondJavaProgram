/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author arpdz2
 */
public class EmployeeTime 
{
    public static void main(String args[]) throws IOException
    {
        int OThours;
        int hours; 
        int wagerate = 8;
        float OTrate = 1.5f;
        float totalpay;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount of hours worked:");
        hours = Integer.parseInt(br.readLine());
        //Scanner sc = new Scanner(System.in);
        
        //System.out.println("Please enter the amount of hours: ");
        //hours = sc.nextInt();
        
        //System.out.println("Please enter the wage rate: ");
        //wagerate = sc.nextInt();
        if(hours >= 40)
        {
        OThours = hours - 40;
        totalpay = (wagerate * (hours - OThours)) + (OTrate * OThours * wagerate);
        
        System.out.println("The total pay is " + totalpay);
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
        System.out.println(fmt.format(totalpay));
        }
        else
        {
        totalpay = (wagerate * hours);
        System.out.println("The total pay is " + totalpay);
        }
    }
}
    

