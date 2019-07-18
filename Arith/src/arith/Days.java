/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arith;

/**
 *
 * @author Sir
 */
public class Days 
{
    public static void main (String[] args)
    {
        int days,years,months,weeks, Days;
        days=Integer.parseInt("1412");
        years=days/365;
        months=days/30-12*years;
        weeks=days/7;
       Days=days%30;
        System.out.println("\n Years="+years);
        System.out.println("\n Months="+months);
        System.out.println("\n Days="+Days);
       System.out.println("\n Weeks="+weeks);
        /** int yr,mn,ds,wk;
        ds=Integer.parseInt("1412");
        mn=ds/12;
        yr=ds/365;
        wk=ds/7;
        System.out.print(ds+","+mn+","+yr+","+wk);*/

    }
}
