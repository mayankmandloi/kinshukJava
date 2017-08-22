/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheri.pack2;

import inheri.pack1.NewClassPack1;

/**
 *
 * @author web-bhumi
 */
public class NewClass1Pack2 extends NewClassPack1 {
    public void showMe()
    {
        System.out.println("inheri.pack2.NewClass1Pack2.showMe()");
    }
    public void checkMe()
    {
        System.out.println("inheri.pack2.NewClass1Pack2.checkMe()");
    }
    public static void main(String[] args) {
        NewClassPack1 ncp1 = new NewClass1Pack2();
        ncp1.showMe();
        
    }
}
