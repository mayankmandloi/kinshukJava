/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 *
 * @author web-bhumi
 */
public class Test1 {
    
public void showMe(int i) throws Exception
{
    if(i<18)
    {
        throw new Exception("User Can not vote");
    }
    else
    {
        System.out.println("user can vote");
    }
}
}

class TestC1
{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        try{
        t1.showMe(2);
        }
        catch(Exception e)
                {
                    System.out.println("You have enterd wrong value please try again");
                }
    }
}