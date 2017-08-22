/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheri;

/**
 *
 * @author web-bhumi
 */
public class ClassThatImplimentsAnInterface implements TestInterface{
   
    public void testMethod()
    {
        System.out.println("inheri.ClassThatImplimentsAnInterface.testMethod()");
    }


    public void test1Method() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
