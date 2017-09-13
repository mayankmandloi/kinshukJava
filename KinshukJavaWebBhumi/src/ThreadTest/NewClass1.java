/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author web-bhumi
 */


public class NewClass1 implements  Runnable{


   public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i+"run");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
   
   
    public static void main(String[] args) throws InterruptedException {
        NewClass1 nc1 = new NewClass1();
       Thread th = new Thread(nc1);
       th.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"main");
            Thread.sleep(2000);
        }
    }
}


