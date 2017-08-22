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
public class NormalClass {
    public static void main(String[] args) {
AbstractClass absClass = new AbstractClass(){void showMe(){System.out.println("absClass.showMe()");}};
        ChildClass cClass = new ChildClass() {
            void showMe() {
                System.out.println("cClass.showMe()");
            }
        };
        absClass.showMe();
        cClass.showMe();
                  
    }
   
}
