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
public class NewClass extends Thread {
    public void run()
    {   
        for (int i = 0; i < 10; i++) {
              try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("mayank");
   
        }
  
    }
    public static void main(String[] args) throws InterruptedException {
        NewClass nc = new NewClass();
        nc.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Kinshuk");
            Thread.sleep(2000);
        }
    }
}
