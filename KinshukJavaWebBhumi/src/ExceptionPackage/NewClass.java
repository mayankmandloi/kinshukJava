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
public class NewClass extends Exception {
    void testMe() throws NewClass
    {
        throw new NewClass();
    }
}
