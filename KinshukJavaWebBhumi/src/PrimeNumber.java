/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PrimeNumber {
    public static void main(String args[])
    {
    int n;
    n=7;
    n = n/2;
    for(int i=2; i<=n; i++)
    {
        if(n%i==0)
        {
            System.out.println("The number is prime");
            break;
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
    
    
}

    private static int rt(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
