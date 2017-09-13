/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOPackage;

import java.io.File;

/**
 *
 * @author web-bhumi
 */
public class NewClass1 {
    public static void main(String[] args) {
        File f = new File("test");
        //f.mkdirs();
        System.out.println( f.delete());
    }
}
