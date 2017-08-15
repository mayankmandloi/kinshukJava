/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

/**
 *
 * @author web-bhumi
 */
public class FIbonacci {

    public static void main(String[] args) {
    int f=10;
    int n1,n2,s;
    n1=0; n2=1;
    for(int i=0; i<=f; i++)
    {
        System.out.println(n2);
        s=n1+n2;
        n1=n2;
        n2=s;       
    }
    }
    
}
