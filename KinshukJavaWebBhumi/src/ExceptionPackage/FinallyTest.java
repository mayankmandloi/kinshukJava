/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionPackage;

/**
 *
 * @author web-bhumi
 */
public class FinallyTest {
    public static void main(String[] args) {
        try
        {
            System.out.println(22/7);
        }
        catch(Exception e)
        {
            System.out.println("I will only run when exception will occuur");
        }
        finally
        {
            System.out.println("I will run always");
        }
    }
}
