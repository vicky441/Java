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
public class Increment 
{
    public static void main(String  args[])
    {
        int a=10,b=20,c;
        c=(++a)+(++b);
        c=(a++)+(b++);
        System.out.println("The value of a="+a);
        System.out.println("The value of b="+b);
        System.out.println("The value of c="+c);
    }
}
