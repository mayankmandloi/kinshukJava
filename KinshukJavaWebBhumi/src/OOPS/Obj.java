/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

/**
 *
 * @author web-bhumi
 */
public class Obj {
    
    public static void main(String[] args) {
       HIdeVariables hd = new HIdeVariables();
       hd.setName("Kinshuk");
        System.out.println(hd.getName());
       HIdeVariables hd1 = new HIdeVariables();
       hd1.setName("Mayank");
        System.out.println(hd1.getName());
        System.out.println(hd.getName());
        hd1= new HIdeVariables();
        System.out.println(hd1.getName());
       
    }
}
