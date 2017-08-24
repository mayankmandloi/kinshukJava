/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kinshukjavawebbhumi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author web-bhumi
 */
public class CanIRun {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello");
        System.out.println("Web Bhumi");
        File fi = new File("kinshuk.txt");
        int i=4;

            if(i==3)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            FileInputStream fis = new FileInputStream(fi);
            System.out.println(12/0);
     
    }
}
