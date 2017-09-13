
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author web-bhumi
 */
public class TextRead {
    public static void main(String[] args) throws Exception {
        
        Scanner s1 = new Scanner(System.in);
      File f = new File("TEXTR.txt");
      f.createNewFile();
      FileWriter FW = new FileWriter(f);
      BufferedWriter BW = new BufferedWriter(FW);
      
    BW.write("Hello, my name is kinshuk");
    BW.close();
    FW.close();
    FileReader FR = new FileReader(f);
    BufferedReader BR = new BufferedReader(FR);
    System.out.println(BR.readLine());
      BR.close();
      FR.close();
      
    }
           
    }

 
