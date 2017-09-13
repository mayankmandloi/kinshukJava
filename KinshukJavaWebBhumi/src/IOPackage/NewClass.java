/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author web-bhumi
 */
public class NewClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File f = new File("t.txt");
        //f.createNewFile();
//        sc = new Scanner(f);
//        System.out.println(sc.nextLine());
        FileInputStream fis = new FileInputStream(f);
        FileReader fr = new FileReader(f);
        fis.close();
        fr.close();
        }
}
