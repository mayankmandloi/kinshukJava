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
public class PrimeNumber{
    public static void main(String[] args) {
        int n1 = 37 ,n3=0;
        int n2=n1/2;
        for(int i=2; i <=n2; i++)
        {    if(n1%i==0){
            n3++;
            }
        }
        if(n3>0)
        {
            System.out.println("The number is not prime");
        }
        else{
        System.out.println("The number is prime");
        }
        
    }
 
}
